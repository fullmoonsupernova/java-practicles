//multiple inheritance 
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class Practical3A {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();

        printer.print();
        printer.scan();
    }
}

//hybrid inheritance 
class Device {
    void powerOn() {
        System.out.println("Device is powered on.");
    }
}

interface PrintableDevice {
    void print();
}

interface ScannableDevice {
    void scan();
}

class SmartPrinter extends Device
        implements PrintableDevice, ScannableDevice {

    public void print() {
        System.out.println("Smart printer is printing.");
    }

    public void scan() {
        System.out.println("Smart printer is scanning.");
    }
}

public class Practical3B {
    public static void main(String[] args) {
        SmartPrinter printer = new SmartPrinter();

        printer.powerOn();
        printer.print();
        printer.scan();
    }
}
