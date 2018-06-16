package com.example.android.playsong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Alyona on 16/03/2018.
 * {@Link MediaActivity shows the list of media files that are stored in the Album {@Link AlbumActivity}}
 */

public class MediaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_list_view);

        //Creating the array of media files
        ArrayList<Song> songs = new ArrayList<Song>();

        //Adding the elements to the array
        songs.add(new Song("Ain't Going Down", "Eric Clapton"));
        songs.add(new Song("Broken Down", "Eric Clapton"));
        songs.add(new Song("Blues Power", "Eric Clapton"));
        songs.add(new Song("Broken Hearted", "Eric Clapton"));
        songs.add(new Song("Don't Blame Me", "Eric Clapton"));
        songs.add(new Song("Easy Now", "Eric Clapton"));
        songs.add(new Song("Hey Hey", "Eric Clapton"));
        songs.add(new Song("Key To Love", "Eric Clapton"));
        songs.add(new Song("It Hurts Me Too", "Eric Clapton"));
        songs.add(new Song("One More Chance", "Eric Clapton"));
        songs.add(new Song("Piligrim", "Eric Clapton"));
        songs.add(new Song("Prsence Of The Lord", "Eric Clapton"));
        songs.add(new Song("River Of Tears", "Eric Clapton"));
        songs.add(new Song("See What Love Can Do", "Eric Clapton"));
        songs.add(new Song("She's Waiting", "Eric Clapton"));
        songs.add(new Song("Walkin' Blues", "Eric Clapton"));

        TextAdapter adapter = new TextAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list1);

        listView.setAdapter(adapter);

    }
}
