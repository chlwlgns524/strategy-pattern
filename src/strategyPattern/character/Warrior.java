package strategyPattern.character;

import strategyPattern.strategies.weapon.Weapon;

public class Warrior extends Character {

     public Warrior() {
        property = "x Warrior x";
        stamina = 500;
        mana = 150;
    }

    @Override
    public void useWeapon() {
        weapon.attack();
    }

    @Override
    public void useVehicle() {
        vehicle.ride();
    }

}
