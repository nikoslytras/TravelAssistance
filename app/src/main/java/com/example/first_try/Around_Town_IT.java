package com.example.first_try;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Around_Town_IT extends Fragment {





    public Around_Town_IT() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.ITA34, R.string.ITA35, R.string.ITA36));
        words.add(new Word(R.string.ITA37, R.string.ITA38, R.string.ITA39));
        words.add(new Word(R.string.ITA40, R.string.ITA41, R.string.ITA42));
        words.add(new Word(R.string.ITA43, R.string.ITA44, R.string.ITA45));
        words.add(new Word(R.string.ITA46, R.string.ITA47, R.string.ITA48));
        words.add(new Word(R.string.ITA49, R.string.ITA50, R.string.ITA51));

        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}

