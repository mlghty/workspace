package composition_example;

public class Employee {

    private String name;
    private double salary;
    private Address address;

    public Employee() {
    }

    public Employee(String name) {
        this();
        this.name = name;
    }

    public Employee(String name, double salary) {
        this(name);
        this.salary = salary;
    }

    public Employee(String name, double salary, Address address) {
        this(name, salary);
        this.address = address;
    }

    public String getEmployeeInfo() {
        return "Name: " + name
                + " Salary: " + salary +
                " Address: " + address.getAddressInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}


// Create "Employee" class with the following fields (and appropriate accessor methods and constructor methods)
//
// private String name
//
// private double salary
//
// private Address address
//
// public String getEmployeeInfo()  // returns all employee info including address
//
//
//
// Create client class in which you create a couple of "Employee" objects and call "getEmployeeInfo()" method and display the result