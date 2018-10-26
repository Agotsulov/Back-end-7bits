package com.sevenbits.roguelike.game.common.components.core;

import com.sevenbits.roguelike.game.engine.Component;
import com.sevenbits.roguelike.game.engine.Entity;

public abstract class Script extends Component {

    public abstract void start();

    public abstract void preUpdate();

    public abstract void update();

    public abstract void postUpdate();

    public void onClick() {}

    public void onTrigger(Entity other) {}

    public void onCollision(Entity other) {}

}
