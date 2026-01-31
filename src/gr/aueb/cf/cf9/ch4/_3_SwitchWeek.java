package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class _3_SwitchWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("1.Monday");
        System.out.println("2.Tuesday");
        System.out.println("3.Wednesday");
        System.out.println("4.Thursday");
        System.out.println("5.Friday");
        System.out.println("6.Saturday");
        System.out.println("7.Sunday");
        System.out.println("give a nr");

        choice = scanner.nextInt();

        switch (choice){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wedn");
            case 4 -> System.out.println("Thursd");
            case 5 -> System.out.println("Frida");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("error");
        }
    }
}
