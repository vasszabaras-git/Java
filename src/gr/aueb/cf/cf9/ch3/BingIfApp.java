package gr.aueb.cf.cf9.ch3;


import java.util.Scanner;

public class BingIfApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = 10;
        int inputNum ;

        System.out.println("give number");

        inputNum = scanner.nextInt();

        if (inputNum == key){
            System.out.println("BINGO!!!!");
        }
        else {
            System.out.println("try again");
        }

    }
}
