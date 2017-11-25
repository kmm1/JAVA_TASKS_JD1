package less13InputOutputStreamsSerilization.tast1;

import java.io.Serializable;

/**
 * Created by Tom on 25.11.2017.
 */
public class Notebook extends Computer implements Serializable {
    TouchPad touchPad;
    transient private String transientString;

    public Notebook(String model, int year, TouchPad touchPad, String transientString) {

        super(model, year);
        this.touchPad = touchPad;
        this.transientString = transientString;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "touchPad=" + touchPad +
                ", transientString='" + transientString + '\'' +
                '}';
    }


}
