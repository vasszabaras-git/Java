package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        boolean isTempBelowZero;
        int temp;

        System.out.println("give temp ");
        temp = scanner.nextInt();

        isTempBelowZero = (temp < 0);
        System.out.println(isTempBelowZero);

    }
}
