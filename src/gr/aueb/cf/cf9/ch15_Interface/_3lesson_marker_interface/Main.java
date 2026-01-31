package gr.aueb.cf.cf9.ch15_Interface._3lesson_marker_interface;

public class Main {

    public static void main(String[] args) {
        Item book = new book(1, "Book A");
        Item cd = new disc(2, "CD A");
        Product product = new Product();

        deliver(book);
        deliver(cd);
        // deliver(product);       // compile-time safety

    }

    public static void deliver(Item item) {
        if (item instanceof book) {
            System.out.println("Delivering book...");
        } else if (item instanceof disc) {
            System.out.println("Delivering CD...");
        } else {
            throw new AssertionError("Unknown item type!");
        }
    }
}
