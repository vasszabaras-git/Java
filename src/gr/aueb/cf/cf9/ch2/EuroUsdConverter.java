package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class EuroUsdConverter {

    public static void main(String[] args) {

        double inputEuro;
        double outputUsd;
        final double parity = 1.1587; //1eur=1.1587usd

        Scanner in = new Scanner(System.in);
        System.out.println("give euro amount");
        inputEuro = in.nextFloat();

        outputUsd = inputEuro * parity;
        System.out.println("is equal with $" + outputUsd);


    }
}
