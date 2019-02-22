package com.lukmannudin.assosiate.mvctutorial;

import java.util.ArrayList;

public class Controller {
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

}
