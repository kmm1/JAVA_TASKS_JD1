package less19Pattern.factory.pizzaVersion1;

/**
 * Created by Tom on 08.12.2017.
 */
public class Factory {
    public Pizza create(String typeOfPizza) {
        switch (typeOfPizza) {
            case "Pepperroni":return new PepperonyPizza();
            case "Cheese":return new CheesePizza();
            case "Veggie":return new VeggiePizza();
        }
        return null;
    }
}
