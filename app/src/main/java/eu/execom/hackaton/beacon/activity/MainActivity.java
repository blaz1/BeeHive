 package eu.execom.hackaton.beacon.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.ViewById;

import eu.execom.hackaton.beacon.R;
import eu.execom.hackaton.beacon.adapter.LocationListAdapter;
import eu.execom.hackaton.beacon.service.BeaconDiscoveryService;
import eu.execom.hackaton.beacon.service.BeaconDiscoveryService_;

@EActivity(R.layout.homepage)
    public class MainActivity extends AppCompatActivity {


    @ViewById
    Toolbar toolbar;



    @Bean
    LocationListAdapter adapter;

    @AfterViews
    void startService() {
        BeaconDiscoveryService_.intent(this).start();
    }

    @AfterViews
    void setViews() {
        setSupportActionBar(toolbar);
        //locationList.setAdapter(adapter);
    }

        @Receiver(actions = BeaconDiscoveryService.NEW_BEACON_SIGHTING)
    void onBeaconSighted() {
        adapter.update(BeaconDiscoveryService.getLocations());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

         toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Homepage");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


//        Button button = (Button)findViewById(R.id.button1);

//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg) {
//                Intent viewIntent = new Intent(getApplicationContext(), SectionActivity.class);
//                startActivity(viewIntent);
//            }
//        });





    }
    @Click
    void button1 () {
        Intent viewIntent = new Intent(getApplicationContext(), SectionActivity_.class);
        startActivity(viewIntent);
    }
}
