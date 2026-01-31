package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class _2_Switch_classification {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade ;
        char classification;

        System.out.println("Give grade between 1-10");
        grade = in.nextInt();

        classification = switch (grade){
            case 1, 2, 3, 4, 5 -> {               // if i have more than 1 command i need body
                System.out.println("fail");
                yield 'F' ;
            }
            case 6, 7, 8 -> 'A' ;
            case 9, 10 -> 'P' ;
            default -> '0' ;
        };

        System.out.println(classification);
    }
}
