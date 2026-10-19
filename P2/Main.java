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

// hierachical inheritance 

class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        System.out.println(
                "Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length = 10;
    double breadth = 5;

    void calculateArea() {
        System.out.println(
                "Area of Rectangle: " + (length * breadth));
    }
}

public class Practical2C {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.calculateArea();

        r.display();
        r.calculateArea();
    }
}
