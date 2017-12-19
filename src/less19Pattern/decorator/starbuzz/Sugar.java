package less19Pattern.decorator.starbuzz;

/**
 * Created by Tom on 08.12.2017.
 */
public class Sugar extends Decorator {
    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }



    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }
}
