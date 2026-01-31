package gr.aueb.cf.cf9.ch8;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
//we need to close the resources, but we need finally. what if the resources are not found??

public class _9_exceptions_finally {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);       // Resource
        int num = 0;

//        try {
//            num = scanner.nextInt();
//            System.out.println("num = " + num);
//        } catch (InputMismatchException e) {
//            System.err.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        } finally {                                   //we need finally in order to close the resources. Th eclosure can also throw an exception
//            try {
//                if (scanner != null) {                //close it only if the scanner object exists. Now the scanner is System.in, could be any resource
//                    scanner.close();
//                }
//            } catch (Exception e) {
//                System.err.println("Error: " + e.getMessage());
//                e.printStackTrace();
//            }
//        }

        try (Scanner scanner = new Scanner(new File("C:/users/a8ana/data.txt"))) {        // try with resources
            num = scanner.nextInt();
            System.out.println("num = " + num);
        } catch (InputMismatchException | FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}