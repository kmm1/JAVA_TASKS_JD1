package less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.EnProducts;

import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.TouchPad;

/**
 * Created by Tom on 21.12.2017.
 */
public class EnTouchPad implements TouchPad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("tracking");
    }
}
