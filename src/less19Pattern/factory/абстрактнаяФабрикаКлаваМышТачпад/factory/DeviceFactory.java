package less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.factory;

import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Keyboard;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Mouse;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.TouchPad;

/**
 * Created by Tom on 21.12.2017.
 */
public interface DeviceFactory {

    Keyboard creareKeydoard();

    TouchPad createTouchPad();

    Mouse createMouse();
}
