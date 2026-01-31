package gr.aueb.cf.cf9.ch9_epanalipsi;
import java.util.Scanner;
/**
 * Create a message that contains the name of the user and the age.
 */
public class _1_1_StrConCat {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        String firstname = "";
        int age = 0;
        String message = "";

        // Είσοδος δεδομένων με scanner, validation και data binding
        System.out.println("Please enter your first name: ");
        firstname = scanner.nextLine();

        System.out.println("Please enter your age: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number: ");
            scanner.nextLine();
        }
        age = scanner.nextInt();

        // Call a service method
        message = createMessage2(firstname, age);

        // Εκτύπωση αποτελεσμάτων
        System.out.println(message);
    }

    /**
     * Creates a message that contains the name of the user and the age.
     * @param firstname     the user's first name.
     * @param age           the user's age.
     * @return              the message.
     */
    public static String createMessage(String firstname, int age) {
        return String.format("Hello, my name is %s and I am %d years old.", firstname, age);
    }

    public static String createMessage2(String name, int age){
        StringBuilder sb = new StringBuilder();
        return sb.append(name).append(" ").append(age).toString();
    }
}