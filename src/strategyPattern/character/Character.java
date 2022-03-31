package strategyPattern.character;

import strategyPattern.strategies.vehicle.Vehicle;
import strategyPattern.strategies.weapon.Weapon;

public abstract class Character {

    protected String property;
    protected int stamina;
    protected int mana;
    protected Weapon weapon;
    protected Vehicle vehicle;

    public void displayState() {
        System.out.println("property: " + property);
        System.out.println("stamina: " + stamina);
        System.out.println("mana: " + mana);
        System.out.println("weapon: " + weapon.getName());
        System.out.println("vehicle: " + vehicle.getName() + "\n");
    }

    public abstract void useWeapon();

    public abstract void useVehicle();

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
