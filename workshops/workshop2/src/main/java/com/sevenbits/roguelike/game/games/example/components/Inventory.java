package com.sevenbits.roguelike.game.games.example.components;

import com.sevenbits.roguelike.game.engine.Component;

public abstract class Inventory extends Component{

    public abstract Item get(int i);

    public abstract void remove(int i);

    public abstract void add(Item item);

    public abstract int size();

    public abstract void print();

}
