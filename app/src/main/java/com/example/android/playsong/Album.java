package com.example.android.playsong;

import java.util.ArrayList;

/**
 * Created by Alyona on 20/03/2018.
 * {@Link Album} represents the list of albums category from {@AlbumActivity}
 * It contains the name of the album and and the name of the artist
 */

public class Album {

    //Name of an album

    private String mNameOfAlbum;

    //Name of an artist

    private String mNameOfArtist;

    public Album(String nameOfArtist, String nameOfAlbum) {
        mNameOfArtist = nameOfArtist;
        mNameOfAlbum = nameOfAlbum;
    }

    //Get the name of the of Artist
    public String getmNameOfArtist() {
        return mNameOfArtist;
    }

    //Get the name of Album
    public String getmNameOfAlbum() {
        return mNameOfAlbum;
    }

}
