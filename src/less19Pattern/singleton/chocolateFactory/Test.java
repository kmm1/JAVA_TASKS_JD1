package less19Pattern.singleton.chocolateFactory;

/**
 * Created by Tom on 08.12.2017.
 */
public class Test {
    public static void main(String[] args) {
        ChocokateBoiler chocolateBoiler = ChocokateBoiler.getInstance();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}
