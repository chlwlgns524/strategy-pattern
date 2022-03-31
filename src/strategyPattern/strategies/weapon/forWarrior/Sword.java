package strategyPattern.strategies.weapon.forWarrior;

import strategyPattern.strategies.weapon.Weapon;

public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("칼로 상대를 찌릅니다.");
    }

    @Override
    public String getName() {
        return "Sword";
    }

}
