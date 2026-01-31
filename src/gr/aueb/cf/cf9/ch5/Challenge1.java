package gr.aueb.cf.cf9.ch5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Challenge1 {

    static Scanner scanner = new Scanner(System.in);

    ///
    public static int menu() {
        System.out.println("--choose one of the following options");
        System.out.println("1.n horizontally stars");
        System.out.println("2.n vertically stars");
        System.out.println("3.n x n stars");
        System.out.println("4.1..n stars");
        System.out.println("5.n..1 stars");
        System.out.println("6. EXIT");
        return scanner.nextInt();
    }

    public static void function1(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print("*");
        }
    }

    public static void function2(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println("*");
        }
    }

    public static void function3(int x) {
        for (int i = 1; i <= x; i++) {
            function1(x);
            System.out.println("");
        }
    }

    public static void function4(int x) {
        for (int i = 1; i <= x; i++) {
            function1(i);
            System.out.println("");
       }
    }


    public static void function5(int x) {
        for (int i = x; i >= 1; i--) {
            function1(i);
            System.out.println("");
        }
    }
    /// --------------------------------------------------------------------------------------
    public static void main(String[] args){
            final int EXITCODE = 6;
            int n ;
            int choice;

            do {
                choice = menu();

                System.out.println("Give now a number 'n' ");
                n = scanner.nextInt();

                switch (choice) {
                    case 1 -> function1(n);
                    case 2 -> function2(n);
                    case 3 -> function3(n);
                    case 4 -> function4(n);
                    case 5 -> function5(n);
                    case 6 -> System.out.println("thank you...Goodbye!!!!");
                    default -> System.out.println("please try again");
                }
                System.out.println(" ");
            } while (choice != EXITCODE);

        }
}
