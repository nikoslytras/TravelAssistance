package com.example.first_try;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;



import android.widget.TextView;

import java.util.ArrayList;


public class LocationAdapter extends ArrayAdapter<Location>{


    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_location, parent, false);
        }



        Location currentLocation = getItem(position);

        TextView TextView = (TextView) listItemView.findViewById(R.id.location_text_view);

        TextView.setText(currentLocation.getText());



        return listItemView;
    }
}

