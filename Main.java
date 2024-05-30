
// Main.java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        // Creating instances of Manager
        Employee manager1 = new Manager("Alice", 101, Department.IT, LocalDate.of(2020, 1, 15), 10);
        Employee manager2 = new Manager("Bob", 102, Department.HR, LocalDate.of(2019, 5, 21), 5);
        Employee manager3 = new Manager("Charlie", 103, Department.SALES, LocalDate.of(2021, 3, 10), 8);
        Employee manager4 = new Manager("Dana", 104, Department.MARKETING, LocalDate.of(2022, 4, 5), 6);

        // Adding employees to the company
        company.addEmployee(manager1);
        company.addEmployee(manager2);
        company.addEmployee(manager3);
        company.addEmployee(manager4);

        // Displaying all employees
        company.displayAllEmployees();

        // Sending salaries to all employees
        company.sendSalaries();
    }
}
