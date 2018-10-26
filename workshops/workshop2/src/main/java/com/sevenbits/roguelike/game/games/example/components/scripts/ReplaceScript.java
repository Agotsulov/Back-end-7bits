package com.sevenbits.roguelike.game.games.example.components.scripts;

import com.sevenbits.roguelike.game.common.components.core.Script;
import com.sevenbits.roguelike.game.engine.Entity;
import com.sevenbits.roguelike.game.games.example.components.Inventory;

public class ReplaceScript extends Script {

    private Inventory myInventory;
    private Inventory chestInventory;

    @Override
    public void start() {
        myInventory = (Inventory) getEntity().get(Inventory.class);
        chestInventory = (Inventory) ((Entity) getEngine().getScene().get("Chest")).get(Inventory.class);
    }

    @Override
    public void preUpdate() {

    }

    @Override
    public void update() {
        for(int i = 0;i < chestInventory.size();i++){
            myInventory.add(chestInventory.get(i));
            chestInventory.remove(i);
        }
    }

    @Override
    public void postUpdate() {

    }

    @Override
    public void dispose() {

    }
}
