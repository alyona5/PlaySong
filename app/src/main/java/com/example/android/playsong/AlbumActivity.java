package com.example.android.playsong;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Alyona on 20/03/2018.
 * {@Link AlbumActivity} shows the list of audio albums stored on the device
 */

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list_view);

        //Assigning on-click listeners to the menu buttons

        //Find the button for recent activity
        Button recent_button = (Button) findViewById(R.id.recent_button);
        recent_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the new {@Link RecentActivity}
                Intent recentButtonIntent = new Intent(AlbumActivity.this, RecentActivity.class);
                //Start new activity
                startActivity(recentButtonIntent);
            }
        });

        //Find the button for store activity
        Button store_button = (Button) findViewById(R.id.store_button);
        store_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the web-site
                Intent storeButtonIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.spotify.com"));
                //Start new activity
                startActivity(storeButtonIntent);
            }
        });
        ;

        //Find the button for radio activity
        Button radio_button = (Button) findViewById(R.id.radio_button);
        radio_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the new {@Link RadioActivity}
                Intent radioButtonIntent = new Intent(AlbumActivity.this, RadioActivity.class);
                //Start new activity
                startActivity(radioButtonIntent);
            }
        });

        //Creating the ArrayList for the albums

        ArrayList<Album> albums = new ArrayList<Album>();

        //Adding the elements to the array album list
        albums.add(new Album("Eric Clapton", "Best"));
        albums.add(new Album("Adele", "25"));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.album);

        listView.setAdapter(adapter);

        /**Adding setOnItemClickListener on album item to start new activity with the list of media
         * files for current album
         * */

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Intent mediaIntent = new Intent(AlbumActivity.this, MediaActivity.class);
                //Start the new activity
                startActivity(mediaIntent);
            }
        });


    }
}
