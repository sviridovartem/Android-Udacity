package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "один"));
        words.add(new Word("two", "два"));
        words.add(new Word("three", "три"));
        words.add(new Word("four", "четыре"));
        words.add(new Word("five", "пять"));
        words.add(new Word("six", "шесть"));
        words.add(new Word("seven", "семь"));
        words.add(new Word("eight", "восемь"));
        words.add(new Word("nine", "девять"));
        words.add(new Word("ten", "десять"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//
//        GridView gridView = (GridView) findViewById(R.id.list);
//
//        gridView.setAdapter(itemsAdapter);


    }


}
