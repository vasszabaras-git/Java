package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int denominator;
        int nominator;
        double result;


        while(true){
            System.out.println("give a nominator ");
            nominator = scanner.nextInt();


            if (nominator == 0){
                break;
            }

            System.out.println("give a denominator ");
            denominator = scanner.nextInt();
            if (denominator ==0 ){
                continue;
            }

            result  = nominator/denominator;
            System.out.println("result is "+ result);
        }

    }
}
