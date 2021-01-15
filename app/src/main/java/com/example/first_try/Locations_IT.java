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

public class Locations_IT extends Fragment {
    public Locations_IT() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.LOCI1, R.string.LOCI2));
        locations.add(new Location(R.string.LOCI3, R.string.LOCI4));
        locations.add(new Location(R.string.LOCI5, R.string.LOCI6));
        locations.add(new Location(R.string.LOCI7, R.string.LOCI8));
        locations.add(new Location(R.string.LOCI9, R.string.LOCI10));
        locations.add(new Location(R.string.LOCI11, R.string.LOCI12));
        locations.add(new Location(R.string.LOCI13, R.string.LOCI14));
        locations.add(new Location(R.string.LOCI15, R.string.LOCI16));
        locations.add(new Location(R.string.LOCI17, R.string.LOCI18));
        locations.add(new Location(R.string.LOCI19, R.string.LOCI20));

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

