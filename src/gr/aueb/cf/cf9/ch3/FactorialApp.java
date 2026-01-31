package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * n! = 1*2*3*..*n
 */
public class FactorialApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nr ;
        int i = 1;
        int result = 1;

        System.out.println("give nr please");
        nr = scanner.nextInt();

        while( i<= nr ){
            result = result * i;  //result *= i
            i ++;  // i += 1;
        }

        System.out.println(result);
    }
}
