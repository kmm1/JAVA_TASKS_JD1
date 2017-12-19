package less19Pattern.decorator.starbuzz;

/**
 * Created by Tom on 08.12.2017.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }


}
