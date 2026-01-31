package gr.aueb.cf.cf9.ch5;

public class FmethodOverload6 {

    public static void main(String[] args) {
        int sum1, sum2;
        long sum3, sum4;

        sum1 = add(3,4);
        sum2 = add(1,2,3);

        sum3 = add(1l, 2l);
        sum4 = add(5l,6l,7l);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
    public static int add(int x, int y){
        return x+y;
    }
    public static long add(long x, long y){
        return  x+y;
    }
    public static int add(int x, int y, int k) {
        return x+y+k;
    }
    public static long add(long x, long y, long k){
        return x+y+k;
    }
}
