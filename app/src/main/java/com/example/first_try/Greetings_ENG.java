package com.example.first_try;


import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Greetings_ENG extends Fragment {

    public Greetings_ENG() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);



        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.ENG1, R.string.ENG2, R.string.ENG3));
        words.add(new Word(R.string.ENG4, R.string.ENG5, R.string.ENG6));
        words.add(new Word(R.string.ENG7, R.string.ENG8, R.string.ENG9));
        words.add(new Word(R.string.ENG10, R.string.ENG11, R.string.ENG12));
        words.add(new Word(R.string.ENG13, R.string.ENG14, R.string.ENG15));
        words.add(new Word(R.string.ENG16, R.string.ENG17, R.string.ENG18));
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
