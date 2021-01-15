package com.example.first_try;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class At_the_Airport_IT extends Fragment {

    public At_the_Airport_IT() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.ITA16, R.string.ITA17, R.string.ITA18));
        words.add(new Word(R.string.ITA19, R.string.ITA20, R.string.ITA21));
        words.add(new Word(R.string.ITA22, R.string.ITA23, R.string.ITA24));
        words.add(new Word(R.string.ITA25, R.string.ITA26, R.string.ITA27));
        words.add(new Word(R.string.ITA28, R.string.ITA29, R.string.ITA30));
        words.add(new Word(R.string.ITA31, R.string.ITA32, R.string.ITA33));

        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
