package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int result = 1;

        System.out.println("give a^b ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        for (int i = 1; i <= b; i++){
            result *= a ;
        }
        System.out.println("result is "+ result);
    }
}
