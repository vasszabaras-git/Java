package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class HoursToMinSec {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputSecs;
        int outputHrs;
        int outputMins;
        int outputSecs;

        System.out.println("give seconds");
        inputSecs = in.nextInt();

        outputHrs = inputSecs / 3600;
        System.out.println("hrs = " + outputHrs);
        System.out.println("mod = " + (inputSecs % 3600));

        outputMins = inputSecs / 60;
        System.out.println("mins " + outputMins);

        outputSecs = inputSecs - (outputMins*60) - (outputHrs*3600);
        System.out.println("secs " + outputSecs);


    }
}
