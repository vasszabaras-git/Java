package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("give base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result *= base; //result = result * base
            i++;
        }

        System.out.printf("result = %,d", result);
    }
}