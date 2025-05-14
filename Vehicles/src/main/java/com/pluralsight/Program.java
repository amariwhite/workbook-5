package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        Moped moped = new Moped("Red", 1, 10, 5);
//        moped.setColor("Red");
//        moped.setFuelCapacity(5);
//        moped.setNumberOfPassengers(1);
//        moped.setCargoCapacity(10);

        Car car = new Car("Blue", 5, 200, 50);
//        car.setColor("Blue");
//        car.setFuelCapacity(50);
//        car.setNumberOfPassengers(5);
//        car.setCargoCapacity(200);

        SemiTruck semiTruck = new SemiTruck("White", 2, 2000, 150);
//        semiTruck.setColor("White");
//        semiTruck.setFuelCapacity(150);
//        semiTruck.setNumberOfPassengers(2);
//        semiTruck.setCargoCapacity(2000);

        Hovercraft hovercraft = new Hovercraft("Gray", 4, 500, 80);
//        hovercraft.setColor("Gray");
//        hovercraft.setFuelCapacity(80);
//        hovercraft.setNumberOfPassengers(4);
//        hovercraft.setCargoCapacity(500);
        System.out.println("Family car seats: " + car.getNumberOfPassengers());
        System.out.println("Hovercraft color: " + hovercraft.getColor());

    }
}
