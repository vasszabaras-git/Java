package gr.aueb.cf.cf9.ch9_epanalipsi;
import java.util.Scanner;
/**
 * This program calculates if a number is even or not.
 *
 * @author a8ana
 */
public class _1_1_Even {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        // Είσοδος Δεδομένων, Validation και Data Binding
        System.out.println("Please enter a number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number:");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        // Επιχειρησιακή Λογική - Παραστάσεις
        result = isEven(num);

        // Εκτύπωση αποτελέσματος
        System.out.println("The number is even: " + result);
    }

    /**
     * Checks if a number is even.
     * @param num   the number to check.
     * @return      true if the number is even, false otherwise.
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}