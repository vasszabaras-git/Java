package gr.aueb.cf.cf9.ch8;

public class _2_exception_Arithmetic {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        int result;

        result = div(num1,num2);
    }

    public static int  div(int n1, int n2){ //trows ArithmeticException
        return n1/n2;
    }
}
