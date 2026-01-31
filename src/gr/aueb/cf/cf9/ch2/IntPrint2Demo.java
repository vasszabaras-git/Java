package gr.aueb.cf.cf9.ch2;

public class IntPrint2Demo {
    public static void main(String[] args) {
        int i = 10000, j = 5;
        int sum = 0;

        sum = i + j;
        System.out.printf("the sum of %,d plus %d is %,d %n", i,j,sum);
    }
}
