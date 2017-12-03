package less8StreamsLambdas.exapmle;

/**
 * Created by Tom on 01.12.2017.
 */
public class Lamp implements ElectricityConsumer {

    public void lampIsOn(){
        System.out.println("лампа включена");
    }

    @Override
    public void electricityIsOn() {
        lampIsOn();
    }
}
