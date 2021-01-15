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

public class Phones_ENG extends Fragment {

    public Phones_ENG() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.phone_list, container, false);
        final ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.add(new Phone(R.string.PHE1, R.string.PHE2));
        phones.add(new Phone(R.string.PHE3, R.string.PHE4));
        phones.add(new Phone(R.string.PHE5, R.string.PHE6));
        phones.add(new Phone(R.string.PHE7, R.string.PHE8));
        phones.add(new Phone(R.string.PHE9, R.string.PHE10));
        phones.add(new Phone(R.string.PHE11, R.string.PHE12));
        phones.add(new Phone(R.string.PHE13, R.string.PHE14));
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

