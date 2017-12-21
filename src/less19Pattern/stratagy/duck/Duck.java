package less19Pattern.stratagy.duck;

import less19Pattern.stratagy.duck.flyBehavior.FlyBehavior;
import less19Pattern.stratagy.duck.quackBehavior.QuackBehavior;

/**
 * Created by Tom on 07.12.2017.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void display();

}