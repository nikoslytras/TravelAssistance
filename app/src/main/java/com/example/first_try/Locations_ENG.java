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
public class Locations_ENG extends Fragment {
    public Locations_ENG() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.location_list, container, false);



        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.LOCE1, R.string.LOCE2));
        locations.add(new Location(R.string.LOCE3, R.string.LOCE4));
        locations.add(new Location(R.string.LOCE5, R.string.LOCE6));
        locations.add(new Location(R.string.LOCE7, R.string.LOCE8));
        locations.add(new Location(R.string.LOCE9, R.string.LOCE10));
        locations.add(new Location(R.string.LOCE11, R.string.LOCE12));
        locations.add(new Location(R.string.LOCE13, R.string.LOCE14));
        locations.add(new Location(R.string.LOCE15, R.string.LOCE16));
        locations.add(new Location(R.string.LOCE17, R.string.LOCE18));
        locations.add(new Location(R.string.LOCE19, R.string.LOCE20));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.location_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Location currentLocation = locations.get(position);
                int currentLocationCoordinates = currentLocation.getCoordinates();
                String CoordinatesString = getResources().getString(currentLocationCoordinates);
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(CoordinatesString));
                startActivity(intent);
            }
        });
        return rootView;
    }
}

