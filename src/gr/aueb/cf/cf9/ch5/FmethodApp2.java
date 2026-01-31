package gr.aueb.cf.cf9.ch5;

public class FmethodApp2 {

    public  static int add(int a, int b){     //int is the returned type
        int sum = 0;
        sum = a + b;
        return sum;
    }


    public static void main(String[] args) {
        int x1 = 10;
        int x2 = 20;
        int sum ;

        sum = FmethodApp2.add(x1,x2);

        System.out.println("sum = " + sum);
    }
}
//oi methodoi static anhkoun sthn classh
//to plhres onoma einai FmethodApp2.add