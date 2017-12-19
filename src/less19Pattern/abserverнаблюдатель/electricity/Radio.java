package less19Pattern.abserverнаблюдатель.electricity;

/**
 * Created by Tom on 07.12.2017.
 */
public class Radio implements ElectricityConsumer {
    @Override
    public void electricityIsOn() {
        System.out.println("Radio is On");
    }
}
