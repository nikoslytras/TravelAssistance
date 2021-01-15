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

public class Important_Locations_ENG extends Fragment {

    public Important_Locations_ENG() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.location_list, container, false);



        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.ILOCE1, R.string.ILOCE2));
        locations.add(new Location(R.string.ILOCE3, R.string.ILOCE4));
        locations.add(new Location(R.string.ILOCE5, R.string.ILOCE6));
        locations.add(new Location(R.string.ILOCE7, R.string.ILOCE8));
        locations.add(new Location(R.string.ILOCE9, R.string.ILOCE10));
        locations.add(new Location(R.string.ILOCE11, R.string.ILOCE12));
        locations.add(new Location(R.string.ILOCE13, R.string.ILOCE14));
        locations.add(new Location(R.string.ILOCE15, R.string.ILOCE16));

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

