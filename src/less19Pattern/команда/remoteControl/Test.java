package less19Pattern.команда.remoteControl;

/**
 * Created by Tom on 09.12.2017.
 */
public class Test {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(1, new ConcreteCommandLight(new Light()));
        remoteControl.pressButten(1);
        remoteControl.undoButten(1);
        remoteControl.pressButten(1);



    }
}
