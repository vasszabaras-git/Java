package gr.aueb.cf.cf9.ch9_epanalipsi;

import java.util.Scanner;

public class _1_0_MyChecks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        System.out.println("How many elements in the array?");
//give the size of the array

        while (true) {

            // check if input is integer
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.nextLine();
                continue;
            }

            size = scanner.nextInt();
            // check if number is negative
            if (size < 0) {
                System.out.println("Number cannot be negative. Try again.");
                continue;
            }
            break; // valid integer and non-negative
        }
        int[] array = new int[size];


        System.out.println("Lets now fill in the table");
        for (int i = 0; i < size; i++){

            while (!scanner.hasNextInt()){
                System.out.println("give number");
                scanner.next();
            }
            array[i] = scanner.nextInt();

        }
    }

    public static int maxValue ( int [] array ) {
        int  maxvl = Integer.MIN_VALUE;
        if (array == null || array.length == 0) return maxvl;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxvl)
                maxvl = array[i];
        }
        return maxvl;
    }
}
