package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class FmethodMenu3 {

    public static void printMenu(){
        System.out.println("make a choice");
        System.out.println("1. input");
        System.out.println("2. delete");
        System.out.println("3. output");
        System.out.println("4.exit");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usersChoice;

        do {
            printMenu();
            usersChoice = scanner.nextInt();

            switch (usersChoice) {
                case 1 -> System.out.println("1 done");
                case 2 -> System.out.println("2.done");
                case 3 -> System.out.println("3.done");
                default -> System.out.println("error");
            }
        }while(usersChoice!=4);

    }
}
