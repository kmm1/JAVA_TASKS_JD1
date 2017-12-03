package less8StreamsLambdas.exapmle;

/**
 * Created by Tom on 01.12.2017.
 */
public class Radio implements ElectricityConsumer {
    public void radioIsOn() {
        System.out.println("радио работает");
    }

    @Override
    public void electricityIsOn() {
        radioIsOn();
    }
}
