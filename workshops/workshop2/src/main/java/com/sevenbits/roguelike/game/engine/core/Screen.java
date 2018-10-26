package com.sevenbits.roguelike.game.engine.core;

public interface Screen {

    void pause();

    void render(float delta);

    void resize(int width, int height);

    void resume();

    void show();

    void hide();

    void dispose();
}
