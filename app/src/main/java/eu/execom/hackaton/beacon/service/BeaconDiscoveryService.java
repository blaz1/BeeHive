package eu.execom.hackaton.beacon.service;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import com.gimbal.android.Beacon;
import com.gimbal.android.BeaconEventListener;
import com.gimbal.android.BeaconManager;
import com.gimbal.android.BeaconSighting;

import org.androidannotations.annotations.EService;

import java.util.ArrayList;
import java.util.List;

import eu.execom.hackaton.beacon.R;
import eu.execom.hackaton.beacon.model.Book;
import eu.execom.hackaton.beacon.model.Location;
import eu.execom.hackaton.beacon.model.SetupData;

import static android.widget.Toast.LENGTH_SHORT;

@EService
public class BeaconDiscoveryService extends Service {

    public static final String NEW_BEACON_SIGHTING = "newBeaconSighting";

    private static final String TAG = "BeaconDiscoveryService";
    private static final BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

    private BeaconEventListener beaconSightingListener;
    private BeaconManager beaconManager;

    private static final List<Location> locations = new ArrayList<>();

    @Override
    public void onCreate() {
        Log.i(TAG, "Service started.");

        checkBluetoothAvailability();

        beaconSightingListener = new BeaconEventListener() {
            @Override
            public void onBeaconSighting(BeaconSighting beaconSighting) {
                super.onBeaconSighting(beaconSighting);

                Beacon beacon = beaconSighting.getBeacon();
                Log.d(TAG, "Beacon sighted " + beacon.getName() + " id: " + beacon.getIdentifier());

                Location newLocation = new Location();
                newLocation.uuid = beacon.getIdentifier();
                newLocation.signalStrength = beaconSighting.getRSSI();

                if (locations.contains(newLocation)) {
                    for (Location location: locations) {
                        if (location.uuid.equals(newLocation.uuid)) {
                            location.signalStrength = newLocation.signalStrength;
                        }
                    }
                } else {
                    locations.add(newLocation);
                }

                sendBroadcast(new Intent(NEW_BEACON_SIGHTING));
            }

        };

        beaconManager = new BeaconManager();
        beaconManager.addListener(beaconSightingListener);
        beaconManager.startListening();
    }

    private void checkBluetoothAvailability() {
        if (bluetoothAdapter != null) {
            checkEnabled();
        } else {
            Toast.makeText(this, R.string.ble_not_supported, LENGTH_SHORT).show();
            Log.e(TAG, "Bluetooth not supported");
        }
    }

    private void checkEnabled() {
        if (!bluetoothAdapter.isEnabled()) {
            Log.w(TAG, "Bluetooth service is disabled. Enabling...");
            bluetoothAdapter.enable();
            Log.i(TAG, "Bluetooth enabled.");
        } else {
            Log.d(TAG, "Bluetooth is enabled and functioning properly.");
        }
    }

    private void addNewLocation(final Location newLocation) {
        for (Location location: locations) {
            if (location.uuid.equals(newLocation.uuid)) {
                return;
            }
        }

        locations.add(newLocation);
    }

    public static ArrayList<Book> getBooksForLocation() {
        int maxSignal=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=0;i<locations.size();i++){
            if(locations.get(i).signalStrength>maxSignal){
                maxSignal=locations.get(i).signalStrength;
                maxIndex=i;
            }
        }

        int maxSectionIndex=0;
        String locationUuid=locations.get(maxIndex).uuid;
        SetupData map=new SetupData();
        for(int i=0;i<map.getListOfLocations().size();i++) {
            if (map.getListOfLocations().get(i).uuid.equals(locationUuid)) {
                maxSectionIndex = map.getListOfLocations().get(i).section.getIdSection();
                break;
            }
        }

        ArrayList<Book> bookList=new ArrayList<>();
        for(Book i : map.getListOfBooks())
            if(i.getSection().getIdSection()==maxSectionIndex)
                bookList.add(i);

        return bookList;
    }

    @Override
    public void onDestroy() {
        beaconManager.removeListener(beaconSightingListener);
        beaconManager.stopListening();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

}
