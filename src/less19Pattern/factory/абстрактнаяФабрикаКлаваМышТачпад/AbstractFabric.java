package less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад;

import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Keyboard;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.Mouse;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.Products.TouchPad;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.factory.DeviceFactory;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.factory.EnFactory;
import less19Pattern.factory.абстрактнаяФабрикаКлаваМышТачпад.factory.RuFactory;

/**
 * Created by Tom on 21.12.2017.
 */
public class AbstractFabric {
    static DeviceFactory getFactoryByName(String name) {
        if (name.equals("Ru")) {
            return new RuFactory();
        } else if (name.equals("En")) {
            return new EnFactory();
        } else throw new RuntimeException("такой фабрики нет");
    }

    public static void main(String[] args) {
        DeviceFactory myFactory = getFactoryByName("Ru");
        Keyboard keyboard = myFactory.creareKeydoard();
        Mouse mouse = myFactory.createMouse();
        TouchPad touchPad = myFactory.createTouchPad();
        keyboard.print();
        mouse.click();


    }


}
