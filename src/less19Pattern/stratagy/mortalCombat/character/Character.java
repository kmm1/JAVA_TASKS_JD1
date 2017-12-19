package less19Pattern.mortalCombat.character;

import less19Pattern.mortalCombat.weapon.WeaponBehavior;

/**
 * Created by Tom on 07.12.2017.
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performWeapon() {
        weaponBehavior.useWeapon();
    }

    public void fight() {
        System.out.println("character is fighting");
    }
}

