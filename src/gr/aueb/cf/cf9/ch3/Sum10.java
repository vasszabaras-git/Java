package gr.aueb.cf.cf9.ch3;

public class Sum10 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10; //nr of iterations
        int i = 1;

        while (i < n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
