package lap14.command.pseudocode;

public class Buttons {
    private Action command;

    public void setCommand(Action command) {
        this.command = command;
    }

    public void onClick() {
        command.perform();
    }
}
