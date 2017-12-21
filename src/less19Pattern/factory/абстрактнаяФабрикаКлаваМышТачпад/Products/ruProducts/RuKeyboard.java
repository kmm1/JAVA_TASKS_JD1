package less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.ruProducts;

import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Keyboard;

/**
 * Created by Tom on 21.12.2017.
 */
public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("расспечатка на русском");
    }
}
