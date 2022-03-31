package strategyPattern.character;

public class Wizard extends Character {

    public Wizard() {
        property = "! Wizard !";
        stamina = 200;
        mana = 450;
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
