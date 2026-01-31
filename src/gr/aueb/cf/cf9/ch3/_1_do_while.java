package gr.aueb.cf.cf9.ch3;

//checks until the value is the same

import java.util.Scanner;

public class _1_do_while {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int key = 10;
        int number;

        do{
            System.out.println("give number");
            number = scanner.nextInt();
            if ( key==number ) {
                System.out.println("Bingo!!!");
                break;
            }
        }
        while(key!=number);
    }
}
