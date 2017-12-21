package less19Pattern.stratagy.duck;


import less19Pattern.stratagy.duck.flyBehavior.FlyNoWay;
import less19Pattern.stratagy.duck.quackBehavior.Quack;

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
