package gr.aueb.cf.cf9.ch3;
/**
 * appears a menu till user selects exit
 */

import java.util.Scanner;

public class DoMenuApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("choose 1 of the followings");
            System.out.println("1.input ");
            System.out.println("2.delete ");
            System.out.println("3.output ");
            System.out.println("4.exit");
            choice = scanner.nextInt();
        } while (choice !=4);

        System.out.println("see you");
    }
}
