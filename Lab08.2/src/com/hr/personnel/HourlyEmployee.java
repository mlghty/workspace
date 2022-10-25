package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;


    public HourlyEmployee() {
    }

    public HourlyEmployee(double rate, double hours) {
        this();
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(rate, hours);
        super.setHireDate(hireDate);
        super.setName(name);

    }

    public String toString(){
        return "Name: " + getName()+ " Rate: " + rate +  " Hours: "+ hours +
                " Hire date: "+ getHireDate();
     }


}
