package it.sevenbits.courses.sm.manager.sm.cmd;

import it.sevenbits.courses.sm.manager.sm.NetworkContainer;

public class PutInCommand implements INetworkManagerCommand {

    private NetworkContainer container;
    private StringBuilder buffer;

    public PutInCommand(NetworkContainer container, StringBuilder buffer) {
        this.container = container;
        this.buffer = buffer;
    }

    @Override
    public void execute() {
        buffer.append(container.getP().getMessage());
    }




}
