package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 * From String to int..
 * reads a string, converts into integer
 */
public class _11_strings_IntegerParseInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lexeme ;
        int num;

        System.out.println("Please enter an integer: ");
        lexeme = scanner.nextLine();            //like nextInt()
        num = Integer.parseInt(lexeme);         // Integer.parseInt(String)  !!converts a String into an int!!

        System.out.println("The number is: " + num);
    }
}