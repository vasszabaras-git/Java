package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class SwitchGradeNew2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("give grade");
        grade = scanner.nextInt();

        switch  (grade){
            case 1, 2, 3, 4, 5 -> System.out.println("below average");
            case 6, 7, 8 -> System.out.println("average");
            case 9, 10 -> System.out.println("great!!");
            default -> System.out.println("error, the grade should be between 1-10 ");
        }


    }
}
