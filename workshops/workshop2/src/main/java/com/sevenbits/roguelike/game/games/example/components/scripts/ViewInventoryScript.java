package com.sevenbits.roguelike.game.games.example.components.scripts;

import com.sevenbits.roguelike.game.common.components.core.Script;
import com.sevenbits.roguelike.game.games.example.components.Inventory;

public class ViewInventoryScript extends Script{

    private Inventory inventory;

    @Override
    public void start() {
        inventory = (Inventory) getEntity().get(Inventory.class);
    }

    @Override
    public void preUpdate() {

    }

    @Override
    public void update() {
        inventory.print();
    }

    @Override
    public void postUpdate() {

    }

    @Override
    public void dispose() {

    }
}
