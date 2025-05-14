package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<>();

        //Houses
        myAssets.add(new House("My House", "2020-06-15", 250000.0,
                "123 Maple St", 1, 1800, 6000));
        myAssets.add(new House("Vacation Home", "2018-03-10", 175000.0,
                "456 Ocean View", 2, 1200, 4500));

        //vehicles
        myAssets.add(new Vehicle("Tom's Truck", "2022-09-01", 40000.0,
                "Ford F-150", 2022, 45000));
        myAssets.add(new Vehicle("Old Reliable", "2010-01-01", 20000.0,
                "Honda Civic", 2010, 120000));

        for (int i = 0; i < myAssets.size(); i++) {
            Asset asset = myAssets.get(i);
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f\n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f\n", asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }

            System.out.println("-------------------------------");
        }




    }
}
