package gr.aueb.cf.cf9.ch6;

public class _0_Recursive_power {

    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        System.out.println("res = " + power(x,y));
    }

    public static int power(int a, int b){
        return (b == 0) ? 1 : a * power( a, b-1);
    }

}
