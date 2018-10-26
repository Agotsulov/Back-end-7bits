package com.sevenbits.roguelike.game.games.example.components;

import com.sevenbits.roguelike.game.common.core.ArrayListEntity;
import com.sevenbits.roguelike.game.common.core.ArrayScene;
import com.sevenbits.roguelike.game.engine.Engine;
import com.sevenbits.roguelike.game.engine.Entity;
import com.sevenbits.roguelike.game.games.example.components.scripts.ReplaceScript;
import com.sevenbits.roguelike.game.games.example.components.scripts.ViewInventoryScript;

public class SimpleScene extends ArrayScene {

    @Override
    public void create(Engine engine) {
        super.create(engine);


        Entity chest = new ArrayListEntity();
        chest.setName("Chest");

        Inventory chestInventory = new ArrayListInventory();

        chestInventory.add(new Sword());

        chest.add(chestInventory);
        chest.add(new ViewInventoryScript());

        add(chest);



        Entity player = new ArrayListEntity();
        player.setName("Player");

        player.add(new ArrayListInventory());
        player.add(new ViewInventoryScript());
        player.add(new ReplaceScript());

        add(player);




    }
}
