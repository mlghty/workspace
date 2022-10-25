package com.car;

import java.time.LocalDate;
import java.util.Arrays;

public class Car {

    // fields
    public static final int MAX_YEAR = 2023;
    public static final int MIN_YEAR = 1990;

    public static final int MIN_MPG = 0;
    // current world record for max mpg
    public static final int MAX_MPG = 101;

    public static final double FLOOR_PRICE = 0.0;
    public static final String[] COLORS = {"RED", "GREEN", "BLACK", "WHITE", "BLUE", "GRAY"};

    private static int carInstances = 0;


    private CarType carType = CarType.SEDAN;
    private String brand;
    private String color;
    private int year;
    private int mpg;
    private double price;

    private LocalDate listDate;
    private LocalDate soldDate;

    // constructors
    public Car() {
        carInstances++;
    }

    public Car(String brand) {
        this();
        setBrand(brand);
    }

    public Car(String brand, String color) {
        this(brand);
        setColor(color);
    }

    public Car(String brand, String color, int year) {
        this(brand, color);
        setYear(year);
    }

    public Car(String brand, String color, int year, int mpg) {
        this(brand, color, year);
        setMpg(mpg);
    }

    public Car(String brand, String color, int year, int mpg, double price) {
        this(brand, color, year, mpg);
        setPrice(price);
    }

    public Car(String brand, String color, int year, int mpg, double price, String carType) {
        this(brand, color, year, mpg, price);
        this.carType = CarType.setCarType(carType);
    }

    public Car(String brand, String color, int year, int mpg, double price, String carType, LocalDate date) {
        this(brand, color, year, mpg, price, carType);
        this.listDate = date;
    }

    // business methods
    public void sellCar(int days) {
        this.soldDate = LocalDate.now().plusDays(days);
    }


    // accessor methods
    public LocalDate getListDate() {
        return listDate;
    }

    public int getCarInstances() {
        return carInstances;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String argColor) {
        for (String colors : COLORS) {
            if (argColor.equalsIgnoreCase(colors)) {
                this.color = colors;
                return;
            }
        }

        System.out.println("\nError not a valid color! choose from: " + Arrays.toString(COLORS) + " setting default to: " + COLORS[2]);
        this.color = COLORS[2];
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= MIN_YEAR && year <= MAX_YEAR) {
            this.year = year;
        } else {
            System.out.println("\nError year must be between " + MIN_YEAR + " - " + MAX_YEAR);
            System.out.println("Setting year to default: 0");
            this.year = 0;
        }
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        if (mpg >= MIN_MPG && mpg <= MAX_MPG) {
            this.mpg = mpg;
            return;
        } else {
            System.out.println("\nError mpg must be between " + MIN_MPG + " - " + MAX_MPG);
            System.out.println("Setting MPG to default: " + MIN_MPG);
            this.mpg = MIN_MPG;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < FLOOR_PRICE) {
            System.out.println("\nError price must be non-negative setting to default: 0");
            this.price = FLOOR_PRICE;
            return;
        } else {
            this.price = price;
        }
    }

    // to string
    public String toString() {
        return "\nBrand: " + brand + "\n" + "Color: " + color + "\n"
                + "Year: " + year + "\n" + "Mpg: " + mpg + "\n" +
                "Price: " + price + "\n" + "Car Type: " + carType + "\n" +
                "Car instances: " + carInstances + "\nList date: " + listDate + "\n"
                + "Sold date: " + soldDate;

    }
}
