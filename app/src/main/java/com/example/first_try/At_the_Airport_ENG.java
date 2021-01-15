package com.example.first_try;


import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class At_the_Airport_ENG extends Fragment {

    public At_the_Airport_ENG() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.ENG19, R.string.ENG20, R.string.ENG21));
        words.add(new Word(R.string.ENG22, R.string.ENG23, R.string.ENG24));
        words.add(new Word(R.string.ENG25, R.string.ENG26, R.string.ENG27));
        words.add(new Word(R.string.ENG28, R.string.ENG29, R.string.ENG30));
        words.add(new Word(R.string.ENG31, R.string.ENG32, R.string.ENG33));
        words.add(new Word(R.string.ENG34, R.string.ENG35, R.string.ENG36));

        WordAdapter adapter = new WordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
