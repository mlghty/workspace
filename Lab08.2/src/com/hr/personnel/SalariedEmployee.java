package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;


    public SalariedEmployee() {
    }

    public SalariedEmployee(String name) {
        this();
    }

    public SalariedEmployee(String name, double salary) {
        super.setName(name);
        this.salary = salary;
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name,salary);
        super.setHireDate(hireDate);

    }

    public String toString(){
        return "Name: " + getName()+ " Salary: " + salary +
                " Hire date: "+ getHireDate();
    }
}
