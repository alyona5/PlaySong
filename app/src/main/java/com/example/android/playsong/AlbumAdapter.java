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
 * Created by Alyona on 20/03/2018.
 */

public class AlbumAdapter extends ArrayAdapter<Album> {
    public AlbumAdapter(Activity context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_list, parent, false);
        }

        //Get the {@Link Album) object located at this position in the album list
        Album currentAlbum = (Album) getItem(position);

        //Find the TextView in the album_list.xml layout with the ID version number
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the version name from the current Artist object and set this text on the name TextView
        artistTextView.setText(currentAlbum.getmNameOfArtist());
        artistTextView.setTextColor(Color.WHITE);

        //Find the TextView in the album_list.xml layout with the ID version number
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_text_view);
        //Get the version name from the current Album object and set this text on the name TextView
        albumTextView.setText(currentAlbum.getmNameOfAlbum());
        albumTextView.setTextColor(Color.WHITE);

        //Return the whole album_list item layout (containing 2 TextViews)
        return listItemView;
    }
}
