package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("red", "красный"));
        words.add(new Word("green", "зеленый"));
        words.add(new Word("brown", "коричневый"));
        words.add(new Word("gray", "серый"));
        words.add(new Word("black", "черный"));
        words.add(new Word("white", "белый"));
        words.add(new Word("dusty yellow", "грязно желтый"));
        words.add(new Word("mustard yellow", "горчично-желтый"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
