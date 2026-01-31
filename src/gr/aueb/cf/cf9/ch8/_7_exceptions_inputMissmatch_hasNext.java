package gr.aueb.cf.cf9.ch8;
/*
user enters a value,
keeps reading till an integer is entered
hasNextInt()
 */
import java.util.Scanner;

public class _7_exceptions_inputMissmatch_hasNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;

        System.out.println("Please enter one int: ");

        while (!scanner.hasNextInt()) {          //it doesnt consume it
            System.out.println("Not accepted characters");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        scanner.close();
    }
}