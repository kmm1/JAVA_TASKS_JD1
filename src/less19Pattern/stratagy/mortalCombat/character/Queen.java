package less19Pattern.mortalCombat.character;

import less19Pattern.mortalCombat.weapon.SwordBehavior;

/**
 * Created by Tom on 07.12.2017.
 */
public class Queen extends Character {

    public Queen() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("queen is fighting");
    }
}
