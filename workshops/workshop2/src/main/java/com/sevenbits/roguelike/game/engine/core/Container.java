package com.sevenbits.roguelike.game.engine.core;

import com.sevenbits.roguelike.game.engine.GameObject;

public interface Container<T extends GameObject> extends GameCollection<T> {

    T get(int i);

    T get(String name);

    T get(Class c);

    Container<T> getAll(String name);

    Container<T> getAll(Class c);
    //Это почти бесполезно, так как Java не может в нужное приведение типов generic классов.

}
