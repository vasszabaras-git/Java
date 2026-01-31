package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class FmethodCalculator7 {

    static Scanner scanner = new Scanner(System.in);  //eksw apo oles tis methodous, class-level
    // hence, all methods can use the scanner

    public static void menu(){
        System.out.println("choose 1 of followings");
        System.out.println("1 addition");
        System.out.println("2 deduction");
        System.out.println("6 exit");
    }

    public static int getInteger(){
        return scanner.nextInt();
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int deduct(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        int choice = 0;
        int x;
        int y;
        final int EXIT = 6;

        while(choice!=EXIT){
            menu();
            System.out.println("give a number");
            choice = getInteger();

            switch (choice) {
                case 1 : {
                    System.out.println("give 2 numbers");
                    x = getInteger();
                    y = getInteger();
                    System.out.println(add(x , y));
                    break;
                }
                case 2 : {
                    System.out.println("give 2 numbers");
                    x = getInteger();
                    y = getInteger();
                    System.out.println(deduct(x , y));
                    break;
                }
                case 6 : {
                    System.out.println("Goodbye!!!!");
                    break;
                }
                default:{
                    System.out.println("-----------------error try again");
                }

            }
        }
    }
}
