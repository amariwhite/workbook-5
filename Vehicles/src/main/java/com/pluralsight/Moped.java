package com.pluralsight;

public class Moped extends Vehicle {

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
    private boolean hasHelmetStorage;

    public boolean isHasHelmetStorage() {
        return hasHelmetStorage;
    }

    public void setHasHelmetStorage(boolean hasHelmetStorage) {
        this.hasHelmetStorage = hasHelmetStorage;
    }
}
