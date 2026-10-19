//single inheritance 

class Vehicle {
    void start() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is running ");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();

        c.start();
        c.drive();
    }
}

// multilevel inheritance 
class Person {
    String name = "Rahul";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department = "IT";

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}
