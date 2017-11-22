package les6OOP.composition;

/**
 * Created by Tom on 21.11.2017.
 */
public class InheritanceVSComposition {
    public static void main(String[] args) {

    Bee a = new Bee(1, "black", new AttackImpl("fly", "sting hard"));
                a.move();


    // if you need another implementation of move()
    // there is no need to change les6OOP.composition.Insect, we can quickly use new method to attack

    Bee b = new Bee(1, "black", new AttackImpl("fly", "sting"));
                b.attack();
}
}