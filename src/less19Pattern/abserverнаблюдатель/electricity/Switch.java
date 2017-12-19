package less19Pattern.abserverнаблюдатель.electricity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 07.12.2017.
 */
public class Switch {
    private List<ElectricityConsumer> list = new ArrayList<>();

    public void addElectricityConsumer(ElectricityConsumer electricityConsumer) {
        list.add(electricityConsumer);
    }

    public void removeElectricytyConsumer(ElectricityConsumer electricityConsumer) {
        list.remove(electricityConsumer);
    }

    public void switchIsOn() {
        System.out.println("Electricity is on");
        for (ElectricityConsumer x : list) {
            x.electricityIsOn();
        }
    }


}
