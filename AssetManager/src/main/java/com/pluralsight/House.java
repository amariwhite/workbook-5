package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int squareFoot, int condition, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.squareFoot = squareFoot;
        this.condition = condition;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double baseRate = 0;
        switch (condition){
            case 1: baseRate = 180.0; break;
            case 2: baseRate = 130.0; break;
            case 3: baseRate = 90.0; break;
            case 4: baseRate = 80.0; break;
        }
        return baseRate * squareFoot + 0.25 * lotSize;
    }
}
