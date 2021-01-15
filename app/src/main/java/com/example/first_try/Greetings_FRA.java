package com.example.first_try;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Greetings_FRA extends Fragment {

    public Greetings_FRA() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.FRA1, R.string.FRA2, R.string.FRA3));
        words.add(new Word(R.string.FRA4, R.string.FRA5, R.string.FRA6));
        words.add(new Word(R.string.FRA7, R.string.FRA8, R.string.FRA9));
        words.add(new Word(R.string.FRA10, R.string.FRA11, R.string.FRA12));
        words.add(new Word(R.string.FRA13, R.string.FRA14, R.string.FRA15));
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
