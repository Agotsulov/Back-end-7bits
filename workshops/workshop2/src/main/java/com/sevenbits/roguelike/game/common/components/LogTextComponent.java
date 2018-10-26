package com.sevenbits.roguelike.game.common.components;

import com.sevenbits.roguelike.game.engine.Component;

public class LogTextComponent extends Component {

    private String text = "TEST";

    public LogTextComponent(String text) {
        this.text = text;
        setName("LogTextComponent");
    }

    public LogTextComponent() {
        setName("LogTextComponent");
    }

    public String getText() {
        return text;
    }

    @Override
    public void dispose() {

    }
}
