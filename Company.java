
// Company.java
import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    // Constructor
    public Company() {
        this.employees = new ArrayList<>();
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Added employee: " + employee.getName());
    }

    // Method to display all employees
    public void displayAllEmployees() {
        System.out.println("All Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Method to send salary to all employees
    public void sendSalaries() {
        System.out.println("Sending salaries:");
        for (Employee employee : employees) {
            double salary = employee.calculateSalary();
            System.out.println("Salary sent to " + employee.getName() + ": $" + salary);
        }
    }
}
