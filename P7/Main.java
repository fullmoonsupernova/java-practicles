
class Demo {
    Demo() {
        System.out.println("Object created successfully.");
    }

    void display() {
        System.out.println("Object is being used.");
    }
}

public class Main {
    public static void main(String[] args) {

      

        Demo obj = new Demo();

        obj.display();

        obj = null;

        System.out.println("Object reference removed.");
        System.out.println("Object is now eligible for garbage collection.");

        System.gc();

        System.out.println("Garbage collection requested.");
        System.out.println("Java manages memory automatically.");
    }
}
