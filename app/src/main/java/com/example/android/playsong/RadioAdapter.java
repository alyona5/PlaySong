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
 * Created by Alyona on 22/03/2018.
 */

  public class RadioAdapter extends ArrayAdapter<Radio> {
        public RadioAdapter(Activity context, ArrayList<Radio> radio) {
            super(context, 0, radio);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            //Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.radio_list, parent, false);
            }

            //Get the {@Link Radio) object located at this position in the radio_list.xml
            Radio currentRadio = (Radio) getItem(position);

            //Find the TextView in the radio_list.xml layout with the ID version number
            TextView radioTextView = (TextView) listItemView.findViewById(R.id.radio_text_view);
            // Get the version name from the current Radio object and set this text on the name TextView
            radioTextView.setText(currentRadio.getmNameOfRadio());
            radioTextView.setTextColor(Color.WHITE);

            //Return the whole radio_list_view item layout (containing 1 TextView)
            return listItemView;
        }
    }


