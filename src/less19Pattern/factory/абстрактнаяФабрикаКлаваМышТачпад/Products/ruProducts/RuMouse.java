package less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.ruProducts;

import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Mouse;

/**
 * Created by Tom on 21.12.2017.
 */
public class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("нажатие");
    }

    @Override
    public void scroll(int derection) {
        System.out.println("скролинг");
    }
}
