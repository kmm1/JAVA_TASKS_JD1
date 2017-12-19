package less19Pattern.mortalCombat.character;

import less19Pattern.mortalCombat.weapon.AxeBehavior;

/**
 * Created by Tom on 07.12.2017.
 */
public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Troll is fighting");
    }

}
