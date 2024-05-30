
// Manager.java
import java.time.LocalDate;

public class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(String name, int id, Department department, LocalDate dateOfJoining, int teamSize) {
        super(name, id, department, dateOfJoining); // Calling the constructor of the base class
        this.teamSize = teamSize;
    }

    // Polymorphism: Overriding the work method
    @Override
    public void work() {
        System.out.println(getName() + " is managing a team of " + teamSize + " people in " + getDepartment()
                + " department, joined on " + getDateOfJoining() + ".");
    }

    @Override
    public double calculateSalary() {
        double baseSalary;
        switch (getDepartment()) {
            case IT:
                baseSalary = 70000;
                break;
            case HR:
                baseSalary = 50000;
                break;
            case SALES:
                baseSalary = 60000;
                break;
            case MARKETING:
                baseSalary = 55000;
                break;
            default:
                baseSalary = 50000; // Default base salary
                break;
        }
        double bonusPerTeamMember = 100; // Example bonus per team member
        return baseSalary + (bonusPerTeamMember * teamSize);
    }

    // Encapsulation: Getter and Setter
    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
