package it.sevenbits.courses.sm.manager.sm.cmd;

public class ClearCommand implements INetworkManagerCommand {

    private StringBuilder buffer;

    public ClearCommand(StringBuilder buffer) {
        this.buffer = buffer;
    }

    @Override
    public void execute() {
        buffer.setLength(0);
    }

}
