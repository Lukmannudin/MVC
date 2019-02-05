package com.lukmannudin.assosiate.mvctutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvPoke;
    Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPoke = findViewById(R.id.rvPoke);

        controller = new Controller(this);
        controller.initData();

    }

    public RecyclerView recyclerViewPoke() {
        return rvPoke;
    }

    public void showRecyclerList() {
        rvPoke.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(this, controller.getMyPoke());
        rvPoke.setAdapter(listAdapter);
    }
}
