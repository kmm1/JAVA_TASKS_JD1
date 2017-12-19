package less19Pattern.animal;

/**
 * Created by Tom on 07.12.2017.
 */
public class Test {
    public static void main(String[] args) {

        Animal cat = new Cat("Cat Boris");
        cat.makeSound();
        cat.setSoundBehavior(new BarkBehavior());
    }
}
