package com.example.first_try;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView TextView = (TextView) listItemView.findViewById(R.id.text_view);
        TextView.setText(currentWord.getmOriginalTranslationId());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslationId());
        TextView proforaTextView = (TextView) listItemView.findViewById(R.id.profora_text_view);
        proforaTextView.setText(currentWord.getmProforaId());
        return listItemView;
    }
}

