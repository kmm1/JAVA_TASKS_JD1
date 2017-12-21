package less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.factory;

import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Keyboard;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Mouse;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.TouchPad;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.ruProducts.RuKeyboard;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.ruProducts.RuMouse;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.ruProducts.RuTouchPad;

/**
 * Created by Tom on 21.12.2017.
 */
public class RuFactory implements DeviceFactory {

    @Override
    public Keyboard creareKeydoard() {
        return new RuKeyboard();
    }

    @Override
    public TouchPad createTouchPad() {
        return new RuTouchPad();
    }

    @Override
    public Mouse createMouse() {
        return new RuMouse();
    }
}

