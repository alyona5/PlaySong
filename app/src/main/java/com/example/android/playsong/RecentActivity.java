package com.example.android.playsong;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Alyona on 16/03/2018.
 * {@Link RecentActivity} shows the list of media files that were played recently
 */

public class RecentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_list_view);

        //Assigning on-click listeners to the menu buttons

        //Find the button for radio activity
        Button radio_button = (Button) findViewById(R.id.radio_button);
        radio_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the new {@Link RadioActivity}
                Intent radioButtonIntent = new Intent(RecentActivity.this, RadioActivity.class);
                //Start new activity
                startActivity(radioButtonIntent);
            }
        });

        //Find the button for music activity
        Button music_button = (Button) findViewById(R.id.music_button);
        music_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the new {@Link AlbumActivity}
                Intent musicButtonIntent = new Intent(RecentActivity.this, AlbumActivity.class);
                //Start new activity
                startActivity(musicButtonIntent);
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

        //Creating the array of media files
        ArrayList<Song> songs = new ArrayList<Song>();

        //Adding the elements to the array media_list_view

        songs.add(new Song("Why Do You Love Me", "Adele"));
        songs.add(new Song("When We Were Young", "Adele"));
        songs.add(new Song("Water Under the Bridge", "Adele"));
        songs.add(new Song("Water and a Flame", "Adele"));
        songs.add(new Song("Turning Tables", "Adele"));
        songs.add(new Song("That's It, I Quit, I'm Moving On", "Adele"));
        songs.add(new Song("Tired", "Adele"));
        songs.add(new Song("Take It All", "Adele"));
        songs.add(new Song("Sweetest Devotion", "Adele"));
        songs.add(new Song("Someone Like You", "Adele"));
        songs.add(new Song("Skyfall", "Adele"));
        songs.add(new Song("Set Fire to the Rain", "Adele"));
        songs.add(new Song("Rumour Has It", "Adele"));
        songs.add(new Song("Rolling in the Deep", "Adele"));

        TextAdapter adapter = new TextAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list1);

        listView.setAdapter(adapter);

    }
}
