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

public class Important_Locations_IT extends Fragment {
    public Important_Locations_IT() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.ILOCI1, R.string.ILOCI2));
        locations.add(new Location(R.string.ILOCI3, R.string.ILOCI4));
        locations.add(new Location(R.string.ILOCI5, R.string.ILOCI6));
        locations.add(new Location(R.string.ILOCI7, R.string.ILOCI8));
        locations.add(new Location(R.string.ILOCI9, R.string.ILOCI10));
        locations.add(new Location(R.string.ILOCI11, R.string.ILOCI12));
        locations.add(new Location(R.string.ILOCI13, R.string.ILOCI14));
        locations.add(new Location(R.string.ILOCI15, R.string.ILOCI16));
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

