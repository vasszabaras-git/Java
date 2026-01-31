package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * gets a grade,
 * 1-5 below thereshold
 * 5-7 average
 * 8-10 great
 */
public class _4_SwitchGradeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        grade = scanner.nextInt();

        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("below average");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("average");
                break;
            case 9:
            case 10:
                System.out.println("great!!");
                break;
            default:
                System.out.println("error, the grade must be between 1-10");
                break;
        }

    }
}
