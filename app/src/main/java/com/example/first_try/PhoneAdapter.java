package com.example.first_try;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PhoneAdapter extends ArrayAdapter<Phone> {


    public PhoneAdapter(Context context, ArrayList<Phone> phones) {
        super(context, 0, phones);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_phone, parent, false);
        }
        Phone currentPhone = getItem(position);
        TextView TextView = (TextView) listItemView.findViewById(R.id.phone_text_view);
        TextView.setText(currentPhone.getText());
        return listItemView;
    }
}

