package com.example.first_try;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Around_Town_FRA extends Fragment {





    public Around_Town_FRA() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);



        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.FRA34, R.string.FRA35, R.string.FRA36));
        words.add(new Word(R.string.FRA37, R.string.FRA38, R.string.FRA39));
        words.add(new Word(R.string.FRA40, R.string.FRA41, R.string.FRA42));
        words.add(new Word(R.string.FRA43, R.string.FRA44, R.string.FRA45));
        words.add(new Word(R.string.FRA46, R.string.FRA47, R.string.FRA48));
        words.add(new Word(R.string.FRA49, R.string.FRA50, R.string.FRA51));

        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

