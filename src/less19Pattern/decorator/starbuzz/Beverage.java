package less19Pattern.decorator.starbuzz;

/**
 * Created by Tom on 08.12.2017.
 */
public abstract class Beverage {
    String description = "abstract beverage";

    public String getDescription() {
        return  description;
    }

    public abstract double cost();
}
