
class Product {
    String name;
    double price;
    int quantity;

    // Default Constructor
    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    // Constructor with product name
    Product(String n) {
        name = n;
        price = 0;
        quantity = 0;
    }

    // Constructor with name and price
    Product(String n, double p) {
        name = n;
        price = p;
        quantity = 1;
    }

    // Constructor with all fields
    Product(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Rs. " + totalCost());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

      

        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 500);
        Product p4 = new Product("Keyboard", 1000, 2);

        System.out.println("1. Default Constructor:");
        p1.display();

        System.out.println("2. Name Constructor:");
        p2.display();

        System.out.println("3. Name and Price Constructor:");
        p3.display();

        System.out.println("4. Full Parameterized Constructor:");
        p4.display();
    }
}
