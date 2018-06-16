package com.example.android.playsong;

/**
 * Created by Alyona on 17/03/2018.
 * {@Link Song} represents the list of media files that is shown in different categories {@Link RecentActivity,
 * @AlbumActivity}.
 * It contains the title of a media file and the name of an artist.
 */

public class Song {

    // Name of a media file

    private String mNameOfMedia;

    //Name of an artist

    private String mNameOfSrc;

    public Song(String nameOfMedia, String nameOfSrc) {
        mNameOfMedia = nameOfMedia;
        mNameOfSrc = nameOfSrc;
    }

    //Get the name of the media

    public String getmNameOfMedia() {
        return mNameOfMedia;
    }

    //Get the name of the artist

    public String getmNameOfSrc() {
        return mNameOfSrc;
    }
}
