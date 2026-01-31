package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining;
        boolean isDark;
        boolean lightsOn;
        int mySpeed;

        System.out.println("is it raining? (true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Give your speed");
        mySpeed = scanner.nextInt();

        System.out.println("is it dark? (true/false)");
        isDark = scanner.nextBoolean();

        lightsOn = (isRaining==true) && (mySpeed>100 || isDark==true);

        System.out.println("lights on??  " + lightsOn);
    }
}
