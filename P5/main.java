
class ComplexNumber {
    int real, imaginary;

    ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }

    ComplexNumber add(ComplexNumber c) {
        int r = real + c.real;
        int i = imaginary + c.imaginary;
        return new ComplexNumber(r, i);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(2, 4);

       
        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        ComplexNumber result = c1.add(c2);

        System.out.print("Addition Result: ");
        result.display();

        System.out.println("\nJava does not support custom operator overloading.");
        System.out.println("Instead, methods like add() are used.");
    }
}
