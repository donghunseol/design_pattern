package ex10;

import ex10.command.Command;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public void setButton(Command command) {
        this.command = command;
    }
}
