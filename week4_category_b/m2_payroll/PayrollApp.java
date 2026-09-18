class Employee {
    private String empId;
    private double salary;

    // Resolves naming clash using this[cite: 1]
    public Employee(String empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    // Resolves field/parameter naming clash using this.salary[cite: 1]
    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    public void printFinalSalary() {
        System.out.println(this.empId + " | Final Salary: Rs " + this.salary);
    }
}

public class PayrollApp {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("E-101", 40000),
            new Employee("E-102", 55000),
            new Employee("E-103", 62000),
            new Employee("E-104", 48000)
        };

        double bonus = 5000.0;

        // Apply bonus to every employee in a single pass[cite: 1]
        for (Employee emp : employees) {
            emp.raiseSalary(bonus);
            emp.printFinalSalary();
        }
    }
}