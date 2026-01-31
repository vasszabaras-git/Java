package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;
//checks is a number is guessed correctly till it finds it

public class _2_while_continue_break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int key = 10;
        int ll;

        while(true){
            System.out.println("give number");
            ll = scanner.nextInt();

            if(ll != key){
                System.out.println("try again");
                continue;  //goes again up (in the while)
            }
            else{
                System.out.println("Bingo!!");
            }
        }

    }
}
