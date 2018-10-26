package com.sevenbits.roguelike.game.engine;


import com.sevenbits.roguelike.game.engine.core.Container;
import com.sevenbits.roguelike.game.engine.core.Input;
import com.sevenbits.roguelike.game.engine.core.Screen;

public abstract class Engine implements Screen,Container<System> {

    public Input input;

    public Engine(Input input) {
        this.input = input;
    }

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public abstract float getDeltaTime();

    public abstract void changeScene(Scene scene);

    public abstract Scene getScene();

}

