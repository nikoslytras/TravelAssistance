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

public class Important_Locations_FRA extends Fragment {


    private LocationAdapter adapter;


    public Important_Locations_FRA() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.ILOCF1, R.string.ILOCF2));
        locations.add(new Location(R.string.ILOCF3, R.string.ILOCF4));
        locations.add(new Location(R.string.ILOCF5, R.string.ILOCF6));
        locations.add(new Location(R.string.ILOCF7, R.string.ILOCF8));
        locations.add(new Location(R.string.ILOCF9, R.string.ILOCF10));
        locations.add(new Location(R.string.ILOCF11, R.string.ILOCF12));
        locations.add(new Location(R.string.ILOCF13, R.string.ILOCF14));
        locations.add(new Location(R.string.ILOCF15, R.string.ILOCF16));
        adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Location currentLocation = locations.get(position);
                int currentLocationCoordinates = currentLocation.getCoordinates();
                String CoordinatesString = getResources().getString(currentLocationCoordinates);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(CoordinatesString));
                startActivity(intent);
            }
        });
        return rootView;
    }
}

