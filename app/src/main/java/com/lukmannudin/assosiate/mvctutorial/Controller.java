package com.lukmannudin.assosiate.mvctutorial;

import android.app.Application;

import java.util.ArrayList;

public class Controller extends Application {
    private MainActivity view;

    private ArrayList<Model> myPoke = new ArrayList<>();

    public Controller(MainActivity view) {
        this.view = view;
    }

    public void initData() {
        myPoke.addAll(DataPokemon.getPokeData());
        view.showRecyclerList();
    }

    public ArrayList<Model> getMyPoke() {
        return myPoke;
    }

    public int getDataSize() {
        return myPoke.size();
    }


}
