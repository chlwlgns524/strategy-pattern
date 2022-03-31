package strategyPattern.strategies.weapon.forWizard;

import strategyPattern.strategies.weapon.Weapon;

public class Cane implements Weapon {

    @Override
    public void attack() {
        System.out.println("지팡이로 마법을 사용하여 적을 공격합니다.");
    }

    @Override
    public String getName() {
        return "Cane";
    }

}
