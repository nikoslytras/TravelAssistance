package com.example.first_try;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Locations_FRA extends Fragment {
    public Locations_FRA() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.LOCF1, R.string.LOCF2));
        locations.add(new Location(R.string.LOCF3, R.string.LOCF4));
        locations.add(new Location(R.string.LOCF5, R.string.LOCF6));
        locations.add(new Location(R.string.LOCF7, R.string.LOCF8));
        locations.add(new Location(R.string.LOCF9, R.string.LOCF10));
        locations.add(new Location(R.string.LOCF11, R.string.LOCF12));
        locations.add(new Location(R.string.LOCF13, R.string.LOCF14));
        locations.add(new Location(R.string.LOCF15, R.string.LOCF16));
        locations.add(new Location(R.string.LOCF17, R.string.LOCF18));
        locations.add(new Location(R.string.LOCF19, R.string.LOCF20));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.location_list);

        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Location currentLocation = locations.get(position);
                int currentLocationCoordinates = currentLocation.getCoordinates();
                String CoordinatesString = getResources().getString(currentLocationCoordinates);
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(CoordinatesString));
                startActivity(intent);
            }
        });
        return rootView;
    }
}

