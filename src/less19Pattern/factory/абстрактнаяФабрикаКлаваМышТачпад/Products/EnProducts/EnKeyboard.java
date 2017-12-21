package less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.EnProducts;

import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Keyboard;

/**
 * Created by Tom on 21.12.2017.
 */
public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("printing in english");
    }
}
