package gr.aueb.cf.cf9.ch5;

public class Challenge2 {

    public static double celsiusToFahrenheit(double x) {
        return x * (9.0/5) + 32;
    }


    public static void main(String[] args) {
        double x;
        double y = 2;

        x = celsiusToFahrenheit(y);
        System.out.printf("%.1f celsius is equal to %.1f Fahrenheit", y, x);
    }
}
