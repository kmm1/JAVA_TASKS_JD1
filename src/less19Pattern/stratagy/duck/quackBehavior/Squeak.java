package less19Pattern.duck.quackBehavior;

/**
 * Created by Tom on 07.12.2017.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
