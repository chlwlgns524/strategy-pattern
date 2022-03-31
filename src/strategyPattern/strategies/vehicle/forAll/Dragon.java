package strategyPattern.strategies.vehicle.forAll;

import strategyPattern.strategies.vehicle.Vehicle;

public class Dragon implements Vehicle {

    @Override
    public void ride() {
        System.out.println("용에 올라타서 날아갑니다.");
    }

    @Override
    public String getName() {
        return "Dragon";
    }

}
