package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int days;
        boolean isDisekto;



        while (true){
            System.out.println("Give year");
            year = scanner.nextInt();

            if (((year % 4 ==0) && (year % 100 !=0)) || (year % 400 == 0)) {
                isDisekto = true;
                System.out.println(isDisekto);
            }
            else {
                System.out.println("is not disekto");
            }
        }
    }
}

