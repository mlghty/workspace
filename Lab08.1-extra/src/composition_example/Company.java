package composition_example;

public class Company {

    private String CompanyName;
    private Employee[] employees = new Employee[100];

    public Company() {
    }

    public Company(String companyName) {
        this();
        CompanyName = companyName;
    }


    public Company(String companyName, Employee[] employees) {
        this(companyName);
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {

//        System.out.println("Test");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }


    }

    public double computeTotalSalaryOfAllEmployees() {

        double totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {


            if (employees[i] == null ) {
                return totalSalary;
            }

            double currentEmployeeSalary = employees[i].getSalary();
            totalSalary += currentEmployeeSalary;
        }

        return totalSalary;

    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
