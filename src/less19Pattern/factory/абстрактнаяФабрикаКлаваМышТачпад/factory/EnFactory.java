package less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.factory;

import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.EnProducts.EnKeyboard;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.EnProducts.EnMouse;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.EnProducts.EnTouchPad;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Keyboard;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Mouse;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.TouchPad;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.ruProducts.RuKeyboard;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.ruProducts.RuMouse;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.ruProducts.RuTouchPad;

/**
 * Created by Tom on 21.12.2017.
 */
public class EnFactory implements DeviceFactory {

    @Override
    public Keyboard creareKeydoard() {
        return new EnKeyboard();
    }

    @Override
    public TouchPad createTouchPad() {
        return new EnTouchPad();
    }

    @Override
    public Mouse createMouse() {
        return new EnMouse();
    }
}

