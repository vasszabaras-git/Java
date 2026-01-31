package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * divide by 10,100,100 till it gets 0.
 * the number of times the while plays it means an extra digid
 */
public class _3_DigitsCount {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int nr;
        int digitsCounter=1;
        int factor = 10;
        System.out.print("give your number ");
        nr = scanner.nextInt();

        while( (nr / factor) !=0 ){
            factor *= 10;
            digitsCounter ++;
        }
        System.out.println(factor);
        System.out.println(digitsCounter);
    }
}