package com.example.firebaselistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ImagesViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images_view);

        int ids[] = {R.drawable.ic_mcdonalds,R.drawable.ic_dunkindonuts,R.drawable.ic_pizzahut};
        String names[] = {"McDonalds","Dunkin Donuts","Pizza Hut"};
        ArrayList<ListImage> imagesList = new ArrayList<ListImage>();

        for (int i=0; i<ids.length; i++)
        {
            imagesList.add(new ListImage(names[i],ids[i]));
        }

        ListView listView = findViewById(R.id.list_view);

        ImageListAdapter adapter =
                new ImageListAdapter(this, R.layout.adapter_view_layout, imagesList);
        listView.setAdapter(adapter);
    }
}
