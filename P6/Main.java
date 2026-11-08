
class Book {
    String title;
    String author;
    double price;

    // Default Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // Parameterized Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Copy Constructor
    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

       

        Book b1 = new Book();

        Book b2 = new Book(
            "Java Programming", "James Gosling", 500
        );

        Book b3 = new Book(b2);

        System.out.println("1. Default Constructor:");
        b1.display();

        System.out.println("2. Parameterized Constructor:");
        b2.display();

        System.out.println("3. Copy Constructor:");
        b3.display();

        b3.price = 700;

        System.out.println("After modifying copied object:");
        b3.display();

        System.out.println("Original Book:");
        b2.display();
    }
}
