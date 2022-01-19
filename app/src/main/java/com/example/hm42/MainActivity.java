package com.example.hm42;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private ArrayList <Model> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        initRecycler();

    }

    private void initRecycler() {
        recycler = findViewById(R.id.recycler);
        Adapter adapter = new Adapter(data);
        recycler.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model(R.drawable.img,"Adahan Kasymaliev"));
        data.add(new Model(R.drawable.img,"Joomart Dubashev"));
        data.add(new Model(R.drawable.img,"Bakai Belekov"));
        data.add(new Model(R.drawable.img,"Anara Erkegulova"));
        data.add(new Model(R.drawable.img,"Bakyt Abdiev"));
        data.add(new Model(R.drawable.img,"Leonardo Dikaprio"));
        data.add(new Model(R.drawable.img,"Bekbolsun Karataev"));
        data.add(new Model(R.drawable.img,"Sadyr Japarov"));
        data.add(new Model(R.drawable.img,"Bema Mametova"));
        data.add(new Model(R.drawable.img,"Batyr Jetmishov"));
    }
}