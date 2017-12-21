package less19Pattern.stratagy.duck;

import less19Pattern.stratagy.duck.flyBehavior.FlyWithWings;
import less19Pattern.stratagy.duck.quackBehavior.Squeak;

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
