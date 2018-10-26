package com.sevenbits.roguelike.game.games.example.components;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInventory extends Inventory {

    private List<Item> items;

    public ArrayListInventory() {
        items = new ArrayList<>();
    }

    public Item get(int i){
        return items.get(i);
    }

    public void remove(int i){
        items.remove(i);
    }

    public void add(Item item){
        items.add(item);
    }

    @Override
    public void print() {
        System.out.println(getEntity().getName());
        for (Item i: items){
            System.out.println("    " + i.getName());
        }
    }


    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void dispose() {

    }
}