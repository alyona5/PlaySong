package com.example.android.playsong;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the recent category
        TextView recent = (TextView) findViewById(R.id.Recent);

        //Set on-click listener to the view
        recent.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the recent category is clicked on
            @Override
            public void onClick(View view) {
                //Create a new intent to open the new {@Link RecentActivity}
                Intent recentIntent = new Intent(MainActivity.this, RecentActivity.class);
                //Start the new activity
                startActivity(recentIntent);
            }
        });

        //Find the view that shows music category
        TextView music = (TextView) findViewById(R.id.Music);

        //Set on-click listener to the view
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the new {@Link MusicActivity}
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                //Start the new activity
                startActivity(albumIntent);
            }
        });

        //Find the view that shows the radio category
        TextView radio = (TextView) findViewById(R.id.Radio);

        //Set on-click listener to the view
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the new {@Link RadioActivity}
                Intent radioIntent = new Intent(MainActivity.this, RadioActivity.class);
                //Start new activity
                startActivity(radioIntent);
            }
        });

        //Find the view that shows the store category
        TextView store = (TextView) findViewById(R.id.Store);

        //Set on-click listener to the view and create intent for opening the store web-site Spotify
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the web-site
                Intent storeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.spotify.com"));
                //Start new activity
                startActivity(storeIntent);
            }
        });
    }
}
