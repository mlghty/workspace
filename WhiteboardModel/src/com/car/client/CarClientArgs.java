package com.car.client;

import com.car.Car;

import java.util.Arrays;

public class CarClientArgs {
    public static void main(String[] args) {

        if (args.length < 6) {

            // brand, color, year, mpg, price, cartype
            String usage = "Usage: java CarClientArgs <brand> <color> <year> <mpg> <price> <cartype>";
            String example = "Example: java CarClientArgs Toyota Red 2022 32 35000.0 Pickup";
            String note = "Note: supported carTypes are MICRO, SEDAN, COUPE, SPORT, SUV, PICKUP, VAN";

            // example
            // Toyota BLACK 2008 22 20000.00 PICKUP


            System.out.println("\nCar Client Args");
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);


            return;
        }

        System.out.println("\nYou provided " + args.length + " arguments: " + Arrays.toString(args));


        String brand = args[0];
        String color = args[1];
        int year = Integer.parseInt(args[2]);
        int mpg = Integer.parseInt(args[3]);
        double price = Double.parseDouble(args[4]);
        String carType = args[5];

        Car car = new Car(brand, color, year, mpg, price, carType);
        System.out.println(car);
    }
}



