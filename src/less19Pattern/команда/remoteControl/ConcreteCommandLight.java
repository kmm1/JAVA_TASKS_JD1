package less19Pattern.команда.remoteControl;

/**
 * Created by Tom on 09.12.2017.
 */
public class ConcreteCommandLight implements ICommand {
    Light light;

    public ConcreteCommandLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
