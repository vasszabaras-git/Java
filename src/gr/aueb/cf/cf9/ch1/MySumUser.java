package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;  // must be exactly like this

public class MySumUser {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("1st nr: ");
        int nr1= k.nextInt();

        System.out.print("2nd nr: ");
        int nr2=k.nextInt();

        int mySumUser = nr1+nr2;

        System.out.println("sum is = " + mySumUser);
        k.close();
    }
}