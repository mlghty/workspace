package composition_example;

public class compostionClient {
    public static void main(String[] args) {
//        Address address1 = new Address("Harligen", "Texas");
        Employee employee1 = new Employee("Joe",5,new Address("Harligen", "Texas"));
        System.out.println(employee1.getEmployeeInfo());

        Company company1 = new Company("TNT");

        for (int i = 0; i < 10; i++){
            Employee temp = new Employee("Joe"+Integer.toString(i),5,new Address("Harligen", "Texas"));
            company1.addEmployee(temp);
        }

        System.out.println(company1.computeTotalSalaryOfAllEmployees());



    }
}
