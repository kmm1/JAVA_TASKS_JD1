package less7Inheritance.mortalCombat;

/**
 * Created by Tom on 22.11.2017.
 */
public abstract class Enemy implements Mortal {
    private String name;
    private Integer health;

    public Enemy(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void takeDamage(int MIN, int MAX, Enemy enemy) {
        int damage = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        health -= damage;
        if (isAlive()) {
            System.out.println("Нанесен урон " + damage + " остаток здоровья у врага " + health);
        } else System.out.println("Враг сражен");
    }

    public abstract void attackHero(Hero hero);

    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        return false;
    }
}
