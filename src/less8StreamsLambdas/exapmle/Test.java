package less8StreamsLambdas.exapmle;

import static java.lang.System.out;

/**
 * Created by Tom on 01.12.2017.
 */
public class Test {

    public static void fire() {
        System.out.println("FIREEEEEEEEEEEEEEE");
    }

    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        Switch aSwitch = new Switch();
        aSwitch.addElectrisityConsumer(lamp);
        aSwitch.addElectrisityConsumer(radio);
        aSwitch.addElectrisityConsumer(new ElectricityConsumer() {
            @Override
            public void electricityIsOn() {
                out.println("Fire!!!");
            }
        });
        aSwitch.addElectrisityConsumer(() -> out.println("FIRE LAMBDA"));
        aSwitch.addElectrisityConsumer(Test::fire);
        aSwitch.switchIsOn();

    }
}