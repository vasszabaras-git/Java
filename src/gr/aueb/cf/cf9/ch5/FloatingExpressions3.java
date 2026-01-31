package gr.aueb.cf.cf9.ch5;

public class FloatingExpressions3 {
    public static void main(String[] args) {

        int intNum = 10;
        float floatNum = 0.1F;
        double doubleNum = 12.51;
        double result = 0;

        //everything is converted in double, which is the largest, auto-widening
        result = floatNum + intNum + doubleNum;

        System.out.printf("result = %f %n", result);
        System.out.printf("result2 = %e", result);
    }
}
