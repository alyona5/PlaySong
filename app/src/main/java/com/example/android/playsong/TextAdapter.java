package com.example.android.playsong;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alyona on 17/03/2018.
 */

public class TextAdapter extends ArrayAdapter<Song> {
    public TextAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.media_list, parent, false);
        }


        //Get the {@Link Song) object located at this position in the media_list.xml
        Song currentSong = (Song) getItem(position);

        //Find the TextView in the media_list.xml layout with the ID version number
        TextView songTextView = (TextView) listItemView.findViewById(R.id.media_text_view);
        // Get the version name from the current Song object and set this text on the name TextView
        songTextView.setText(currentSong.getmNameOfMedia());
        songTextView.setTextColor(Color.WHITE);

        //Find the TextView in the media_list.xml layout with the ID version number
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.src_text_view);
        //Get the version name from the current Song object and set this text on the name TextView
        artistTextView.setText(currentSong.getmNameOfSrc());
        artistTextView.setTextColor(Color.WHITE);

        //Return the whole media_list_view item layout (containing 2 TextViews)
        return listItemView;
    }
}
