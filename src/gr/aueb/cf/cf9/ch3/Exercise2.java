package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;


        while  (true){
            System.out.println("1. import");
            System.out.println("2. delete");
            System.out.println("3. update");
            System.out.println("4. search");
            System.out.println("5. exit");
            System.out.println("Please give a number");
            choice = scanner.nextInt();

            if (choice<1 || choice>5) {
                System.out.println("not valid");
                continue;
            }
            if  (choice==5) {
                System.out.println("bye bye");
                break;
            }

            if (choice==1){
                    System.out.println("DONE");
                }
            else if (choice==2) {
                    System.out.println("DONE");
                }
            else if (choice==3) {
                    System.out.println("DONE");
                }
            else
                {
                    System.out.println("DONE");

            }


        }
    }
}