package less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.EnProducts;

import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Mouse;

/**
 * Created by Tom on 21.12.2017.
 */
public class EnMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("clicking");
    }

    @Override
    public void scroll(int derection) {
        System.out.println("scroling");
    }
}
