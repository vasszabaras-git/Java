package gr.aueb.cf.cf9.ch6;

public class _0_Recursive_factorial {
    public static void main(String[] args) {
        int result = 0;
        result = facto(5);
        System.out.println(result);
    }

    public static int facto( int n) {
       // if (n == 1) {
       //     return 1;
        //     }
        // return n * facto(n -1);

        return n <= 1 ? 1: n * facto(n-1);    //triadiko; sto return
    }


}
