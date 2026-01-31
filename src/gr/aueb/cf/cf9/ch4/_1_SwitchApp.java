package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * give menu
 */
public class _1_SwitchApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 4;

        do{
            System.out.println("choose one of the followings");
            System.out.println("1. one player");
            System.out.println("2. two player");
            System.out.println("3. three player");
            System.out.println("4. exit");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("start 1");
                    break;
                case 2:
                    System.out.println("start 2");
                    break;
                case 3:
                    System.out.println("start 3");
                    break;
                case 4:
                    System.out.println("exit game");
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } while (choice != EXIT);

        System.out.println("goodbye!!!");
    }
}
