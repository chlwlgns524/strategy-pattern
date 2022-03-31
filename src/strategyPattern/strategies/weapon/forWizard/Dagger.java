package strategyPattern.strategies.weapon.forWizard;

import strategyPattern.strategies.weapon.Weapon;

public class Dagger implements Weapon {

    @Override
    public void attack() {
        System.out.println("단도를 이용하여 적을 급소를 노립니다.");
    }

    @Override
    public String getName() {
        return "Dagger";
    }

}
