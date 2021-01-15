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

public class Phones_IT extends Fragment {

    public Phones_IT() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.phone_list, container, false);
        final ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.add(new Phone(R.string.PHI1, R.string.PHI2));
        phones.add(new Phone(R.string.PHI3, R.string.PHI4));
        phones.add(new Phone(R.string.PHI5, R.string.PHI6));
        phones.add(new Phone(R.string.PHI7, R.string.PHI8));
        phones.add(new Phone(R.string.PHI9, R.string.PHI10));
        phones.add(new Phone(R.string.PHI11, R.string.PHI12));
        PhoneAdapter adapter = new PhoneAdapter(getActivity(), phones);


        ListView listView = (ListView) rootView.findViewById(R.id.phone_list);


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Phone currentPhone = phones.get(position);
                int currentPhoneNumber = currentPhone.getPhone();

                String PhoneString = getResources().getString(currentPhoneNumber);
                String uri = "tel:" + PhoneString.trim() ;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(uri));
                startActivity(intent);
            }
        });
        return rootView;
    }
}

