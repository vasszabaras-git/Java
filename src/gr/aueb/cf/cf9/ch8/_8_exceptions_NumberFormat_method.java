package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;
/**
 * Checks until a given string is an integer with a boolean method.
 */
public class _8_exceptions_NumberFormat_method {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        int num = 0;

        System.out.println("Please enter a number: ");
        // inputStr = scanner.nextLine();
        while (!isInteger(inputStr = scanner.nextLine())) {
            System.out.println("Οι χαρακτήρες είναι μη αποδεκτοί");
        }
        num = Integer.parseInt(inputStr);
        System.out.println("The number is: " + num);
    }


    public static boolean isInteger(String s) {
        return s.matches("-?[0-9]+");
    }
}
