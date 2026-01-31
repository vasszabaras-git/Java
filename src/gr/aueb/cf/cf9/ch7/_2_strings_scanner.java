package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class _2_strings_scanner {

    /**
     * String Input/Output.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // System.out.println("Please enter first string: ");
        //String str = scanner.next();  // διαβάζει μέχρι να βρει whitespace (spaces, tab, new line)

        System.out.println("Please enter second string: ");
        String str2 = scanner.nextLine();  // διαβάζει μέχρι να βρει new line

       // System.out.println("First string: " + str);
        System.out.println("Second string: " + str2);
    }
}