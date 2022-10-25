package com.car.client;

import com.car.Car;

import java.time.LocalDate;

public class CarClient {

    public static void main(String[] args) {
        // brand, color, year, mpg, price, cartype
        System.out.println("\nCar client");
        LocalDate listDate1 = LocalDate.now().plusDays(76);
        Car car1 = new Car("Kia","Black",2020,35,350000,"Sedan",listDate1);
        System.out.println(car1);

        // brand, color, year, mpg, price, cartype
        LocalDate listDate2 = LocalDate.now().plusDays(5);
        Car car2 = new Car("Toyota","Red",2022,38,359000, "Pickup", listDate2);
        System.out.println(car2);


    }

}
