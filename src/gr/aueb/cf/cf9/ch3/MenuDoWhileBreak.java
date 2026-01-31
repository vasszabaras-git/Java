package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class MenuDoWhileBreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        while(true){
            System.out.println("choose 1 of the followings");
            System.out.println("1.input ");
            System.out.println("2.output ");
            System.out.println("3.exit ");
            choice = scanner.nextInt();
            if (choice == 3) {
                break;
            }

        }
        System.out.println("see you, you chose " + choice);
    }
}
