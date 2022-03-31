package strategyPattern;

import strategyPattern.character.Character;
import strategyPattern.character.Warrior;
import strategyPattern.character.Wizard;
import strategyPattern.strategies.vehicle.forAll.Dragon;
import strategyPattern.strategies.vehicle.forAll.Horse;
import strategyPattern.strategies.weapon.forWizard.Cane;
import strategyPattern.strategies.weapon.forWarrior.Sword;

public class Main {

    public static void main(String[] args) {
        Character warrior = new Warrior();

        warrior.setWeapon(new Sword());
        warrior.setVehicle(new Horse());

        warrior.displayState();
        warrior.useWeapon();
        warrior.useVehicle();
        System.out.println();

        Character wizard = new Wizard();

        wizard.setWeapon(new Cane());
        wizard.setVehicle(new Dragon());

        wizard.displayState();
        wizard.useWeapon();
        wizard.useVehicle();

    }

}
