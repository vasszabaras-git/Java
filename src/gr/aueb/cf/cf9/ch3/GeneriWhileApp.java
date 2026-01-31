package gr.aueb.cf.cf9.ch3;

/**
 * i give starting, end value and step and ca;culates number of repetitions
 */
public class GeneriWhileApp {
    public static void main(String[] args) {
        int i = 1;
        int endVal = 10;

        while ( i <= 10) {
            System.out.println(" i = " + i);
            i++;
        }
        System.out.println("loops are " + (i-1));

    }
}
