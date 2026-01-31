package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class ScannerApp {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("give 2 numbers ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println(sum );

    }
}
