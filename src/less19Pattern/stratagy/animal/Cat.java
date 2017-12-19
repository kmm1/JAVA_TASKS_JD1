package less19Pattern.animal;

/**
 * Created by Tom on 07.12.2017.
 */
public class Cat extends Animal {
    String name;

    public Cat(String name) {
        this.name = name;
        soundBehavior = new MeowBehavior();
    }
}
