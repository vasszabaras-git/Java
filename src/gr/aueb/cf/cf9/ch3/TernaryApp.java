package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class TernaryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1;
        int n2;
        int n3;
        int min;

        System.out.println("give n1");
        n1 = scanner.nextInt();
        System.out.println("give n2");
        n2 = scanner.nextInt();

        // conditional assignment
        min = ( n1 < n2 ) ? n1 : n2 ;   //if (cond), then, else


    }
}
