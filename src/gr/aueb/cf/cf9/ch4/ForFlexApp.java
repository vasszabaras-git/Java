package gr.aueb.cf.cf9.ch4;
/**
 * the user defines the start, end, step value for i
 */

import java.util.Scanner;

public class ForFlexApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iter = 0;

        System.out.println("GIVE START, END, STEP");
        startValue = scanner.nextInt();
        endValue = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startValue; i<= endValue; i += step){
            iter++;
            System.out.println(iter);
        }

    }
}
