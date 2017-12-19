package less19Pattern.команда.remoteControl;

/**
 * Created by Tom on 09.12.2017.
 */
public class Light {
    private boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("Лампа вкл");
    }

    void off() {
        isOn = false;
        System.out.println("Лампа выкл");

    }
}
