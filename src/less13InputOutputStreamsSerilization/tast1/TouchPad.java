package less13InputOutputStreamsSerilization.tast1;

import java.io.Serializable;

/**
 * Created by Tom on 25.11.2017.
 */
public class TouchPad extends Computer implements Serializable {
    private String touchPadFeacher;

    public TouchPad(String model, int year, String touchPadFeacher) {
        super(model, year);
        this.touchPadFeacher = touchPadFeacher;
    }

    @Override
    public String toString() {
        return "TouchPad{" +
                "model=" + super.getModel() +
                ", year=" + super.getYear() +
                ",touchPadFeacher='" + touchPadFeacher + '\'' +
                '}';
    }
}
