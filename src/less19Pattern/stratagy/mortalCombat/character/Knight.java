package less19Pattern.mortalCombat.character;

import less19Pattern.mortalCombat.weapon.BoxAndArrowBehavior;

/**
 * Created by Tom on 07.12.2017.
 */
public class Knight extends Character {
    public Knight() {
        weaponBehavior = new BoxAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Knight is fighting");
    }
}
