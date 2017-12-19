package less19Pattern.factory.pizzaVersion1;

/**
 * Created by Tom on 08.12.2017.
 */
public class PizzaStory {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Pizza pepperroni = factory.create("Pepperroni");
        pepperroni.orderPizza();

    }

}
