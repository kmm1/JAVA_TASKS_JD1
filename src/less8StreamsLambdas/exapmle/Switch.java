package less8StreamsLambdas.exapmle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 01.12.2017.
 */
public class Switch {

    private List<ElectricityConsumer> list = new ArrayList<>();

    public void addElectrisityConsumer(ElectricityConsumer electricityConsumer) {
        if (!list.contains(electricityConsumer))
            list.add(electricityConsumer);
    }

    public void removeElectrisityConsumer(ElectricityConsumer electricityConsumer) {
        if (list.contains(electricityConsumer))
            list.remove(electricityConsumer);
    }


    public void switchIsOn() {
        System.out.println("Выключатель включен");
        for (ElectricityConsumer e : list)
            e.electricityIsOn();
    }


}
