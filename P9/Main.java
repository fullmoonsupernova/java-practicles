
class Employee {
    String name;
    double salary;

    static int count = 0;

    // Default Constructor
    Employee() {
        this("Unknown", 0);
    }

    // Parameterized Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    void display() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: Rs. " + this.salary);
    }

    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

       
        Employee e1 = new Employee();
        Employee e2 = new Employee("Rahul", 30000);
        Employee e3 = new Employee("Aman", 40000);

        System.out.println("\nEmployee 1:");
        e1.display();

        System.out.println("\nEmployee 2:");
        e2.display();

        System.out.println("\nEmployee 3:");
        e3.display();

        System.out.println();
        Employee.displayCount();
    }
}
