package less19Pattern.mortalCombat.character;

import less19Pattern.mortalCombat.weapon.AxeBehavior;
import less19Pattern.mortalCombat.weapon.BoxAndArrowBehavior;
import less19Pattern.mortalCombat.weapon.KnightBehavior;

/**
 * Created by Tom on 07.12.2017.
 */
public class MortalCombat {
    public static void main(String[] args) {
        Troll troll = new Troll();
        Knight knight = new Knight();
        Queen queen = new Queen();
        King king = new King();
        troll.setWeaponBehavior(new AxeBehavior());
        troll.performWeapon();
        troll.fight();
        troll.setWeaponBehavior(new BoxAndArrowBehavior());
        troll.performWeapon();
        troll.fight();

        knight.performWeapon();
        knight.setWeaponBehavior(new AxeBehavior());
        knight.performWeapon();

        queen.setWeaponBehavior(new KnightBehavior());

    }
}
