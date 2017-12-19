package less19Pattern.duck;

import less19Pattern.duck.flyBehavior.FlyWithWings;
import less19Pattern.duck.quackBehavior.Squeak;

/**
 * Created by Tom on 07.12.2017.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I.m a Mallard duck");
    }
}
