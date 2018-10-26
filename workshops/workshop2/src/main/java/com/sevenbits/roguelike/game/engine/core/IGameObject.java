package com.sevenbits.roguelike.game.engine.core;

import com.sevenbits.roguelike.game.engine.Engine;

public interface IGameObject {

    void create(Engine engine);

    void dispose();

    String getName();

    void setName(String name);

}
