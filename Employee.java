
// Employee.java
import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private int id;
    private Department department;
    private LocalDate dateOfJoining;

    // Constructor
    public Employee(String name, int id, Department department, LocalDate dateOfJoining) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.dateOfJoining = dateOfJoining;
    }

    // Encapsulation: Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    // Abstract method to be implemented by subclasses
    public abstract void work();

    // Abstract method for calculating salary
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department=" + department +
                ", dateOfJoining=" + dateOfJoining +
                '}';
    }
}
