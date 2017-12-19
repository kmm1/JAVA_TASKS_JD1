package less19Pattern.decorator.starbuzz;

/**
 * Created by Tom on 08.12.2017.
 */
public class Starbuzz {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Sugar(houseBlend);
        houseBlend = new Sugar(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
