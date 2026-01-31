package gr.aueb.cf.cf9.ch3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class SnowingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining;
        boolean isSnowing;
        boolean isBelowZero;
        int temp;

        System.out.println("type true if it is raining, otherwise false");
        isRaining = scanner.nextBoolean();

        System.out.println("give temperature please");
        temp = scanner.nextInt();
        isBelowZero = (temp < 0);

        isSnowing = isBelowZero && isRaining;
        System.out.println("is snowing?  " + isSnowing);
    }
}
