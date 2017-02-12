package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("father", "папа"));
        words.add(new Word("mother", "мама"));
        words.add(new Word("son", "сын"));
        words.add(new Word("daughter", "дочка"));
        words.add(new Word("older brother", "старший брат"));
        words.add(new Word("younger brother", "младший брат"));
        words.add(new Word("older sister", "Старшая сестра"));
        words.add(new Word("younger sister", "младшая сестра"));
        words.add(new Word("grandmother", "бабушка"));
        words.add(new Word("grandfather", "дедушка"));




        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
