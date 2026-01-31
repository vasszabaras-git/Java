package gr.aueb.cf.cf9.ch4;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerAppBigInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Give a^b  ");

        a = BigInteger.valueOf(scanner.nextInt());    // BigInteger.valueOf(int)  μετατρέπουμε από int σε Big Integer
        b = BigInteger.valueOf(scanner.nextInt());

        for (int i = 1; i <= b.intValue(); i++){      // bigInt.intValue()        bigint -> int
            result = result.multiply(a);              //bigInt.multiply(bigInt)   πολλαπλασιάζουμε δύο big integers
        }
        System.out.println(result);
    }
}
