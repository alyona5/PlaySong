package com.example.android.playsong;

/**
 * Created by Alyona on 22/03/2018.
 * {@Link Radio} represents the list of radio stations that is shown in {@Link RadioActivity} category.
 * It contains the name of the radio station.
 */

public class Radio {

    // Name of the radio station

    private String mNameOfRadio;

    public Radio (String nameOfRadio) {
        mNameOfRadio = nameOfRadio;
    }

    //Get the name of the radio station

    public String getmNameOfRadio() {
        return mNameOfRadio;
    }

}
