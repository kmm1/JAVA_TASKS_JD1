package less19Pattern.duck;

import less19Pattern.duck.flyBehavior.FlyNoWay;
import less19Pattern.duck.quackBehavior.Quack;

/**
 * Created by Tom on 07.12.2017.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }


    @Override
    public void display() {
        System.out.println("im a model duck");
    }
}
