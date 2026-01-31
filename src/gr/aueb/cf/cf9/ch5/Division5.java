package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class Division5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = 0.0;
        double n2 = 0.0;
        double result = 0.0;
        double remaining = 0.0;


        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        result = n1 / n2;
        remaining = n1 % n2;   //10.5 mod 2.3 ------> 10.5 % 2 = 0.5 the result here

        System.out.printf("division %5.5f %n", result);
        System.out.printf("remaining %.7f %n", remaining);
        System.out.printf("remaining %.7f %n", remaining);


    }
}
