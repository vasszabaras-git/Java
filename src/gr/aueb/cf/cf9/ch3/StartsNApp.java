package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class StartsNApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("give how many starts you want ");
        n = scanner.nextInt();

        while ( n > 0) {
            System.out.println("*");
            n--;
        }

    }
}
