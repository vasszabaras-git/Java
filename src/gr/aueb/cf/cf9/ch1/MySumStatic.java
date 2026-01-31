package gr.aueb.cf.cf9.ch1;
/*
 * variables outside the main
 */


public class MySumStatic {
    static int nr1= 10;
    static int nr2= 20;
    static int mySum2;

    public static void main(String[] args) {
        mySum2= nr1 +nr2;
        System.out.println(mySum2);
    }
}
