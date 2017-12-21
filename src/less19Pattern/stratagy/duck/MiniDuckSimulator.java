package less19Pattern.stratagy.duck;

import less19Pattern.stratagy.duck.flyBehavior.FlyRocketPowered;

/**
 * Created by Tom on 07.12.2017.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}