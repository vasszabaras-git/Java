package gr.aueb.cf.cf9.ch5;

public class Challenge5 {

    public static int findMax(int a, int b, int c){
        int temp;
        temp = Math.max(a,b);
        return Math.max(temp,c);
    }
    public static void main(String[] args) {
        System.out.println( findMax(9,7,1) );
    }
}
