package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class _nested_methods_EvenOdd {

    public static boolean check(int a){
        return   (a % 2) == 0;
    }

    public static boolean check2(boolean check) {
        return ! check;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        boolean isEven;
        boolean isOdd;

        System.out.println("give number please");
        a = scanner.nextInt();
        isEven = check(a);
        isOdd = check2(isEven);

        System.out.println("is it even? " + isEven);
        System.out.println("is it odd ? " + isOdd);
    }
}
