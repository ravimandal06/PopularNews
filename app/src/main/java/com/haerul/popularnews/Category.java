package com.haerul.popularnews;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Category extends AppCompatActivity {


    private ListAdapter Adapter;

    public Category(ListAdapter adapter) {
        Adapter = adapter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_news);



        //ListView + ArrayAdapter(View Recycler)

        ListView listView = (ListView) findViewById(R.id.categoryView);
        listView.setAdapter(Adapter);


    }
}