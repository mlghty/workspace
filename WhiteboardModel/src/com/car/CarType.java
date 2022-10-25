package com.car;

import java.util.Arrays;

public enum CarType {
    MICRO,
    SEDAN,
    COUPE,
    SPORT,
    SUV,
    PICKUP,
    VAN;


    public static CarType setCarType(String type) {
        for (CarType cartype : CarType.values()) {
            if (type.equalsIgnoreCase(cartype.toString())) {
                return cartype;
            }

        }

        System.out.println("Error Car Type invalid please select from: " + Arrays.toString(CarType.values()));
        System.out.println("Setting Car Type to default: Sedan ");
        return CarType.SEDAN;

    }

}
