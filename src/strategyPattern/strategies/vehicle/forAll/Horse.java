package strategyPattern.strategies.vehicle.forAll;

import strategyPattern.strategies.vehicle.Vehicle;

public class Horse implements Vehicle {

    @Override
    public void ride() {
        System.out.println("말에 올라타서 달립니다.");
    }

    @Override
    public String getName() {
        return "Horse";
    }


}
