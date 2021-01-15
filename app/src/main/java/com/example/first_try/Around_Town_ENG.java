package com.example.first_try;


import androidx.fragment.app.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

public class Around_Town_ENG extends Fragment {





    public Around_Town_ENG() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.ENG37, R.string.ENG38, R.string.ENG39));
        words.add(new Word(R.string.ENG40, R.string.ENG41, R.string.ENG42));
        words.add(new Word(R.string.ENG43, R.string.ENG44, R.string.ENG45));
        words.add(new Word(R.string.ENG46, R.string.ENG47, R.string.ENG48));
        words.add(new Word(R.string.ENG49, R.string.ENG50, R.string.ENG51));
        words.add(new Word(R.string.ENG52, R.string.ENG53, R.string.ENG54));




        WordAdapter adapter = new WordAdapter(getActivity(), words);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);




        return rootView;
    }






}

