package com.example.first_try;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Greetings_IT extends Fragment {

    public Greetings_IT() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.ITA1, R.string.ITA2, R.string.ITA3));
        words.add(new Word(R.string.ITA4, R.string.ITA5, R.string.ITA6));
        words.add(new Word(R.string.ITA7, R.string.ITA8, R.string.ITA9));
        words.add(new Word(R.string.ITA10, R.string.ITA11, R.string.ITA12));
        words.add(new Word(R.string.ITA13, R.string.ITA14, R.string.ITA15));
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
