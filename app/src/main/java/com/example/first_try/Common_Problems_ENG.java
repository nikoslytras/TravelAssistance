package com.example.first_try;


import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Common_Problems_ENG extends Fragment {

    public Common_Problems_ENG() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.ENG55, R.string.ENG56, R.string.ENG57));
        words.add(new Word(R.string.ENG58, R.string.ENG59, R.string.ENG60));
        words.add(new Word(R.string.ENG61, R.string.ENG62, R.string.ENG63));

        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
