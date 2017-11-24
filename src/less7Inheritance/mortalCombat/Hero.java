package less7Inheritance.mortalCombat;

/**
 * Created by Tom on 22.11.2017.
 */
public abstract class Hero implements Mortal {
    private String name;
    private Integer health;

    public Hero(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        return false;
    }

    public void takeDamage(int MIN, int MAX) {
        int damage = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        health -= damage;
        if (isAlive()) {
            System.out.println("Нанесен урон " + damage + " остаток здоровья у героя " + health);
        } else System.out.println("Герой побежден");
    }

}
