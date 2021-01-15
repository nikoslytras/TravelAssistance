package com.example.first_try;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Common_Problems_IT extends Fragment {

    public Common_Problems_IT() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.ITA52, R.string.ITA53, R.string.ITA54));
        words.add(new Word(R.string.ITA55, R.string.ITA56, R.string.ITA57));
        words.add(new Word(R.string.ITA58, R.string.ITA59, R.string.ITA60));
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
