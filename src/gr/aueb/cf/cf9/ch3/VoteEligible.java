package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class VoteEligible {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int age;
        final int VOTING_AGE = 18;
        boolean isEligible;

        System.out.println("give your age");
        age = scanner.nextInt();

        isEligible = (age >= VOTING_AGE);
        System.out.println("you are eligible?  " + isEligible);

    }
}
