package less13InputOutputStreamsSerilization.tast1;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Tom on 25.11.2017.
 */
public class Computer implements Serializable {
    private String model;
    private int year;

    public Computer(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;


    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}


