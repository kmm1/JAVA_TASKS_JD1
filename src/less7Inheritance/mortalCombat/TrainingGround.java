package less7Inheritance.mortalCombat;

/**
 * Created by Tom on 22.11.2017.
 */
public class TrainingGround {
    public static void main(String[] args) {
        Enemy zombie = new Zombie("Зомби Шон", 10, 0);

        Hero archer = new Archer("Ваня", 20);
        archer.attackEnemy(zombie);
        zombie.attackHero(archer);
        archer.attackEnemy(zombie);
        zombie.attackHero(archer);
        archer.attackEnemy(zombie);
        zombie.attackHero(archer);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);
        archer.attackEnemy(zombie);



//        Hero warror = new Warrior("Вася");
//        warror.attackEnemy(enemy);
//        Hero mage = new Mage("Гендальф");
//        mage.attackEnemy(enemy);
    }
}
