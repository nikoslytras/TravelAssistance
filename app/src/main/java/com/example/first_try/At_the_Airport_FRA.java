package com.example.first_try;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class At_the_Airport_FRA extends Fragment {

    public At_the_Airport_FRA() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.FRA16, R.string.FRA17, R.string.FRA18));
        words.add(new Word(R.string.FRA19, R.string.FRA20, R.string.FRA21));
        words.add(new Word(R.string.FRA22, R.string.FRA23, R.string.FRA24));
        words.add(new Word(R.string.FRA25, R.string.FRA26, R.string.FRA27));
        words.add(new Word(R.string.FRA28, R.string.FRA29, R.string.FRA30));
        words.add(new Word(R.string.FRA31, R.string.FRA32, R.string.FRA33));
        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
