package com.example.first_try;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Common_Problems_FRA extends Fragment {

    public Common_Problems_FRA() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.FRA52, R.string.FRA53, R.string.FRA54));
        words.add(new Word(R.string.FRA55, R.string.FRA56, R.string.FRA57));
        words.add(new Word(R.string.FRA58, R.string.FRA59, R.string.FRA60));
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
