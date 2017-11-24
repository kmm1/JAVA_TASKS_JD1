package less7Inheritance.mortalCombat;

/**
 * Created by Tom on 22.11.2017.
 */
public class Zombie extends Enemy {
    private Integer raisedAgain;

    public Zombie(String name, Integer health, Integer raisedAgain) {
        super(name, health);
        this.raisedAgain = raisedAgain;
    }

    public Integer getRaisedAgain() {
        return raisedAgain;
    }

    public void setRaisedAgain(Integer raisedAgain) {
        this.raisedAgain = raisedAgain;
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби атакует героя");
        hero.takeDamage(5, 6);
    }



    @Override
    public void takeDamage(int MIN, int MAX, Enemy enemy) {
        int damage = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        enemy.getHealth().equals(enemy.getHealth() - damage);
        enemy.setHealth(enemy.getHealth() - damage);
        if (isAlive()) {
            System.out.println("Нанесенннн урон " + damage + " остаток здоровья у врага " + super.getHealth());
        } else if (enemy.getHealth() <= 0 & ((Zombie) enemy).getRaisedAgain().equals(0)) {
            enemy.setHealth(10);
            ((Zombie) enemy).setRaisedAgain(getRaisedAgain() + 1);
            System.out.println("Зомби воскрес! Здоровье: " + enemy.getHealth());
        } else System.out.println("Враг повержен!");
    }


}
