package composition_example;

public class Address {


    private String city;
    private String country;

    public Address() {
    }

    public Address(String city) {
        this();
        this.city = city;
    }

    public Address(String city, String country) {
        this(city);
        this.country = country;
    }

    public String getAddressInfo() {
        return "City: " + city +
                " Country: " + country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}

// Exercise #1 - composition
//
//
//
// Create "composition_example" package under any module of your choice
//
// Create "Address" class with the following fields and methods (and appropriate accessor methods and constructor methods)
//
// private String city
//
// private String country
//
// public String getAddressInfo()      // returns city and country info
//
//
//
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