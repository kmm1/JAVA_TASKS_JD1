package less7Inheritance.mortalCombat;

/**
 * Created by Tom on 22.11.2017.
 */
public class Archer extends Hero {

    public Archer(String name, Integer health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник атакует врага");
        enemy.takeDamage(5, 6, enemy);

    }
}
