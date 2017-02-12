package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Where are you going?", "куда ты собираешься?"));
        words.add(new Word("What is your name?", "как тебя зовут?"));
        words.add(new Word("My name is...", "меня зовут..."));
        words.add(new Word("How are you feeling?", "как ты себя чувствуешь?"));
        words.add(new Word("I’m feeling good.", "я - нормально"));
        words.add(new Word("Are you coming?", "Ты идешь?"));
        words.add(new Word("Yes, I’m coming.", "да, подхожу"));
        words.add(new Word("I’m coming.", "я подхожу"));
        words.add(new Word("Let’s go.", "идем"));
        words.add(new Word("Come here.", "подойди"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
