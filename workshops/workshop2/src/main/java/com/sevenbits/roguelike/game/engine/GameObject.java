package com.sevenbits.roguelike.game.engine;

import com.sevenbits.roguelike.game.engine.core.Debugable;
import com.sevenbits.roguelike.game.engine.core.IGameObject;

import java.lang.System;

public abstract class GameObject implements IGameObject, Debugable {
    
    protected String name = "GameObject";

    protected Engine engine = null;

    private boolean debug = true;

    public void create(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public void log(String massage) {
        if(debug)
            System.out.println(name + ":" + massage);
    }
}
