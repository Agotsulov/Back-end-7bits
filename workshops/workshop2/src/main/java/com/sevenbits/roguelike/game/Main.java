package com.sevenbits.roguelike.game;

import com.sevenbits.roguelike.game.common.core.ArrayListEngine;
import com.sevenbits.roguelike.game.common.core.HashMapInput;
import com.sevenbits.roguelike.game.common.systems.InputSystem;
import com.sevenbits.roguelike.game.common.systems.LogTextSystem;
import com.sevenbits.roguelike.game.common.systems.ScriptSystem;
import com.sevenbits.roguelike.game.engine.Engine;
import com.sevenbits.roguelike.game.engine.Scene;
import com.sevenbits.roguelike.game.games.example.components.SimpleScene;

public class Main {

    public static void main(final String[] args) {
        Engine engine = new ArrayListEngine(new HashMapInput());

        engine.add(new InputSystem());
        engine.add(new ScriptSystem());
        engine.add(new LogTextSystem());

        Scene scene = new SimpleScene();

        engine.changeScene(scene);

        for(int i = 0; i < 10;i++){
            engine.render(0);
        }

    }

}
