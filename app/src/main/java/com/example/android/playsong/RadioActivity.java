package com.example.android.playsong;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Alyona on 16/03/2018.
 * {@Link RadioActivity shows the list of radio stations for online streaming
 */

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_list_view);

        //Assigning on-click listeners to the menu buttons

        //Find the button for recent activity
        Button recent_button = (Button) findViewById(R.id.recent_button);
        recent_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the new {@Link RecentActivity}
                Intent recentButtonIntent = new Intent(RadioActivity.this, RecentActivity.class);
                //Start new activity
                startActivity(recentButtonIntent);
            }
        });

        //Find the button for store activity
        Button store_button = (Button) findViewById(R.id.store_button);
        store_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the web-site Spotify
                Intent storeButtonIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.spotify.com"));
                //Start new activity
                startActivity(storeButtonIntent);
            }
        });
        ;

        //Find the button for radio activity
        Button music_button = (Button) findViewById(R.id.music_button);
        music_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the new {@Link AlbumActivity}
                Intent musicButtonIntent = new Intent(RadioActivity.this, AlbumActivity.class);
                //Start new activity
                startActivity(musicButtonIntent);
            }
        });

        //Creating the list of radio stations

        ArrayList<Radio> radio = new ArrayList<Radio>();

        //Adding the elements to the list

        radio.add(new Radio("HitFM"));
        radio.add(new Radio ("Gala Radio"));
        radio.add(new Radio ("Auto Radio"));
        radio.add(new Radio ("Lux FM"));

        RadioAdapter adapter = new RadioAdapter (this, radio);

        ListView listView = (ListView) findViewById(R.id.list1);

        listView.setAdapter(adapter);
    }
}