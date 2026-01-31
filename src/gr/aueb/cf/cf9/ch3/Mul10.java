package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * calculate the multiplication of a range that the user defines
 */
public class Mul10 {
    public static void main(String[] args) {
        int result = 1;
        int start, end;

        Scanner scanner = new Scanner(System.in);

        System.out.println("give start ");
        start = scanner.nextInt();
        System.out.println("give end ");
        end = scanner.nextInt();

        while (end >= start){
            result = result * start;//result *= start
            System.out.println(result);
            start++;
        }
        System.out.printf("result = %,d" , result);
    }

}
