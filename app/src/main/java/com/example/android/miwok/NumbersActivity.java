package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "lutty"));
        words.add(new Word("two", "asdasdasd"));
        words.add(new Word("three", "asdasdasd"));
        words.add(new Word("four", "asdasdasd"));
        words.add(new Word("five", "asdasdasd"));
        words.add(new Word("six", "asdasdasd"));
        words.add(new Word("seven", "asdasdasd"));
        words.add(new Word("eight", "asdasdasd"));
        words.add(new Word("nine", "asdasdasd"));
        words.add(new Word("ten", "asdasdasd"));

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
