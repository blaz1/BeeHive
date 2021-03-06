package eu.execom.hackaton.beacon.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.ViewById;

import eu.execom.hackaton.beacon.R;
import eu.execom.hackaton.beacon.adapter.BookGridAdapter;
import eu.execom.hackaton.beacon.service.BeaconDiscoveryService;
import eu.execom.hackaton.beacon.service.BeaconDiscoveryService_;

/**
 * Created by D on 11/28/2015.
 */
@EActivity(R.layout.sections)
public class BookActivity extends AppCompatActivity {

        @ViewById
        Toolbar toolbar;

        @ViewById
        GridView grid;

        @Bean
        BookGridAdapter adapter;

        @AfterViews
        void startService() {
            BeaconDiscoveryService_.intent(this).start();
        }

        @AfterViews
        void setViews() {
            setSupportActionBar(toolbar);
            grid.setAdapter(adapter);
        }

        @Receiver(actions = BeaconDiscoveryService.NEW_BEACON_SIGHTING)
        void onBeaconSighted() {
            adapter.update(BeaconDiscoveryService.getBooksForLocation());
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.sections);

            toolbar = (Toolbar) findViewById(R.id.toolbar);
            if(toolbar != null) {
                setSupportActionBar(toolbar);
                getSupportActionBar().setTitle("Sections");
                getSupportActionBar().setHomeButtonEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }


            Button button = (Button)findViewById(R.id.button2);

            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View arg) {
                    Intent viewIntent = new Intent(getApplicationContext(), MainActivity_.class);
                    startActivity(viewIntent);
                }
            });


        }
}
