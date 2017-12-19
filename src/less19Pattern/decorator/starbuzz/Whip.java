package less19Pattern.decorator.starbuzz;

/**
 * Created by Tom on 08.12.2017.
 */
public class Whip extends  Decorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Whip";
    }

    @Override
    public double cost() {
        return 0.25+ beverage.cost();
    }
}
