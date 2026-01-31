package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("give a number ");
            num = scanner.nextInt();

            if (num == 5) {     //ignores whatever below and goes up again
                continue;
            }

            sum += num;

            if (num == 0){
                break;
            }

        }
        System.out.printf("num= %d  and sum=%d", num, sum);
    }
}
