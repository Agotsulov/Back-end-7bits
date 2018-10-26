package com.sevenbits.roguelike.game.engine.core;

public interface Debugable {

    boolean isDebug();

    void setDebug(boolean debug);

    void log(String massage);
}
