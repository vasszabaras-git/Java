package gr.aueb.cf.cf9.ch5;

public class FmethodAdd1 {

    public  static int add(int a, int b){
        //int sum = 0;
        //sum = a + b;
        //return sum;
        return a + b;
    }



    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sum ;

        sum = add(a,b);

        System.out.println("sum = " + sum);
    }
}
