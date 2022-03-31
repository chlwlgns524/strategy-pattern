package strategyPattern.strategies.weapon.forWarrior;

import strategyPattern.strategies.weapon.Weapon;

public class Fist implements Weapon {

    @Override
    public void attack() {
        System.out.println("주먹으로 상대를 가격합니다.");
    }

    @Override
    public String getName() {
        return "Fist";
    }

}
