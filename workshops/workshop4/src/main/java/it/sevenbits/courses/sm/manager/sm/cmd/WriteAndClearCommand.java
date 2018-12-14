package it.sevenbits.courses.sm.manager.sm.cmd;

public class WriteAndClearCommand implements INetworkManagerCommand {

    private StringBuilder buffer;

    public WriteAndClearCommand(StringBuilder buffer) {
        this.buffer = buffer;
    }

    @Override
    public void execute() {
        System.out.println(buffer.toString());
        buffer.setLength(0);
    }

}