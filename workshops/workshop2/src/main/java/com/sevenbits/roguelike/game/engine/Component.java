package com.sevenbits.roguelike.game.engine;

public abstract class Component extends GameObject{

    protected Entity entity;

    protected boolean alive = true;

    public void create(Engine engine, Entity entity) {
        create(engine);
        setEntity(entity);
        rebirth();
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void rebirth(){
        alive = true;
    }

    public void kill(){
        alive = false;
    }

}
