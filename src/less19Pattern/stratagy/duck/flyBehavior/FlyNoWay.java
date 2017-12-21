package less19Pattern.stratagy.duck.flyBehavior;

/**
 * Created by Tom on 07.12.2017.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
