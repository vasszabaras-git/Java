package gr.aueb.cf.cf9.ch5;

public class EpsilonApp6 {
    public static void main(String[] args) {

        final double EPSILON = 0.000005;
        double actual  = 0.0;
        double expected = 1.0;

        for (int i = 1; i <= 10; i++) {
            actual += 0.1;
        }

        if (Math.abs(actual-expected) <= EPSILON) System.out.println("equal");
        else System.out.println("not equal");

        if (actual==expected) System.out.println("yes equal");
        else System.out.println("no it is not equal");
    }
}
