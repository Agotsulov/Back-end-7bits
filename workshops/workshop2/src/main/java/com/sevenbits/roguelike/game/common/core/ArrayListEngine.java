package com.sevenbits.roguelike.game.common.core;


import com.sevenbits.roguelike.game.engine.Engine;
import com.sevenbits.roguelike.game.engine.Scene;
import com.sevenbits.roguelike.game.engine.core.Container;
import com.sevenbits.roguelike.game.engine.core.Input;
import com.sevenbits.roguelike.game.engine.System;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEngine extends Engine {

    private List<System> systems = new ArrayList<System>();
    private Scene scene;
    private Scene next;

    private boolean sceneChanged = true;

    public ArrayListEngine(Input input) {
        super(input);
    }


    @Override
    public void changeScene(Scene scene) {
        next = scene;
        sceneChanged = true;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        if(sceneChanged){ //TODO: Проверить и вытащить это отсюда.
            clear();

            scene = next;
            scene.create(this);

            for(int i = 0;i < size();i++) {
                get(i).start();
            }

            sceneChanged = false;
        }
        else {
            for (int i = 0; i < systems.size(); i++) {
                systems.get(i).preUpdate();
            }

            for (int i = 0; i < systems.size(); i++) {
                systems.get(i).update();
            }

            for (int i = 0; i < systems.size(); i++) {
                systems.get(i).postUpdate();
            }
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        for (int i = 0;i < systems.size();i++)
            systems.get(i).dispose();
    }

    @Override
    public void add(System system) {
        systems.add(system);
        system.create(this);
    }

    @Override
    public void add(int i, System system) {
        systems.add(i,system);
        system.create(this);
    }

    @Override
    public System get(int i) {
        return systems.get(i);
    }

    @Override
    public int size() {
        return systems.size();
    }

    @Override
    public void clear() {
        for (int i = 0;i < systems.size();i++)
            systems.get(i).clear();
    }

    @Override
    public float getDeltaTime() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return systems.isEmpty();
    }

    @Override
    public System remove(int i) {
        return systems.remove(i);
    }

    @Override
    public boolean remove(Object o) {
        return systems.remove(o);
    }

    @Override
    public Scene getScene() {
        return scene;
    }

    @Override
    public System get(String name) {
        return null;
    }

    @Override
    public System get(Class c) {
        return null;
    }

    @Override
    public Container<System> getAll(String name) {
        return null;
    }

    @Override
    public Container<System> getAll(Class c) {
        return null;
    }
}
