package less19Pattern.singleton.chocolateFactory;

/**
 * Created by Tom on 08.12.2017.
 */
public class ChocokateBoiler {
    private boolean empty = true;
    private boolean boiled = false;
    private static ChocokateBoiler unicqueCondition;


    private ChocokateBoiler(boolean empty, boolean boiled) {
        this.empty = empty;
        this.boiled = boiled;
    }

    // public static synchronized ChocokateBoiler getInstance() {
    public static ChocokateBoiler getInstance() {
        if (unicqueCondition == null) {
            synchronized (ChocokateBoiler.class) {
                unicqueCondition = new ChocokateBoiler(true, false);
            }
        }
        return unicqueCondition;
    }


    public void fill() { //заполнение нагревателя шоколадно-молочной смесью
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() { //слить нагретое молоко и шоколад
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() { //вскепятить смесь
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled = true;
    }

}

