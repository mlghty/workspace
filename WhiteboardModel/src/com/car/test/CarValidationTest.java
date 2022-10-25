package com.car.test;

import com.car.Car;
import com.car.CarType;

import java.time.LocalDate;

public class CarValidationTest {

    public static void main(String[] args) {

        // push test
        // car1 all args valid
        // brand, color, year, mpg, price
        // all fields correct
        Car car1 = new Car("Toyota", "Red", 2022, 35, 350000);
        System.out.println("Car1: " + car1);

        // brand, color, year, mpg, price, cartype
        // color arg incorrect, error
        Car car2 = new Car("Toyota", "Redss", 2022, 35, 350000);
        System.out.println("\nCar2: " + car2);

        // brand, color, year, mpg, price, cartype
        // year arg not in range
        Car car3 = new Car("Toyota", "Red", 2028, 35, 350000);
        System.out.println("\nCar3: " + car3);

        Car carError = new Car("Toyota", "Red", 1990, 35, 350000);
        System.out.println("\ncarError: " + carError);


        // brand, color, year, mpg, price, cartype
        // mpg not in range
        Car car4 = new Car("Toyota", "Red", 2022, 11, 350000);
        System.out.println("\nCar4: " + car4);

        Car carError1 = new Car("Toyota", "Red", 2022, -1, 350000);
        System.out.println("\ncarError1: " + carError1);

        // brand, color, year, mpg, price, cartype
        // price arg not correct
        Car car5 = new Car("Toyota", "Red", 2022, 35, -350000);

        // Individual methods tests
        System.out.println("\nIndividual methods test");

        // brand test
        car5.setBrand("Toyota");
        String brandTest = car5.getBrand();
        System.out.println("Brand test pass: " + (brandTest == "Toyota"));

        // carType test
        car5.setCarType(CarType.SPORT);
        CarType carTypeTest = car5.getCarType();
        System.out.println("CarType test pass: " + (carTypeTest == CarType.SPORT));


        // color test
        car5.setColor("RED");
        String colorTest = car5.getColor();
        System.out.println("Color test pass: " + (colorTest == "RED"));

        // mpg test
        car5.setMpg(66);
        int mpgTest = car5.getMpg();
        System.out.println("MPG test pass: " + (mpgTest == 66));


        // car instances test
        int instanceTest = car5.getCarInstances();
        System.out.println("Instance test pass: " + (instanceTest == 7));

        // price test
        car5.setPrice(55000.00);
        double priceTest = car5.getPrice();
        System.out.println("Price test pass: " + (priceTest == 55000.00));


        // year test
        car5.setYear(1999);
        int yearTest = car5.getYear();
        System.out.println("Year test pass: " + (yearTest == 1999));

        // list date test
        LocalDate listdateTest = LocalDate.now();
        LocalDate car5listDate = car5.getListDate();
        System.out.println("List date test pass: " + (listdateTest == car5listDate));

        // sell car test
        car5.sellCar(5);
        System.out.println(car5);


    }


}
