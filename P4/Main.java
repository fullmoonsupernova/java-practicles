//overloading 
class Calculator {

    
    int add(int a, int b) {
        return a + b;
    }


    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: "
                + calc.add(10, 20));

        System.out.println("Sum of three integers: "
                + calc.add(10, 20, 30));

        System.out.println("Sum of two doubles: "
                + calc.add(5.5, 4.5));
    }
}

//overriding 
class Employee {

    double calculatePay() {
        return 20000;
    }
}

class Manager extends Employee {

    @Override
    double calculatePay() {
        return 50000;
    }
}

class Developer extends Employee {

    @Override
    double calculatePay() {
        return 40000;
    }
}

public class Main {

    public static void main(String[] args) {

        Employee e;

        e = new Manager();
        System.out.println("Manager Pay: "
                + e.calculatePay());

        e = new Developer();
        System.out.println("Developer Pay: "
                + e.calculatePay());
    }
}
