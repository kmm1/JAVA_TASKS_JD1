package less19Pattern.abserverнаблюдатель.electricity;

/**
 * Created by Tom on 07.12.2017.
 */
public class Test {
    public static void main(String[] args) {
        Switch aSwitch = new Switch();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        aSwitch.addElectricityConsumer(lamp);
        aSwitch.addElectricityConsumer(radio);
        aSwitch.switchIsOn();

    }
}