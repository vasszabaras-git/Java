package gr.aueb.cf.cf9.ch4;

public class SumMulApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <=5; i++){
            sum += i;
            mul *= i;
        }
        System.out.println("sum is "+ sum);
        System.out.println("mul is "+ mul);
    }
}
