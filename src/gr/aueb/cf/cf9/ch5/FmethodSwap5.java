package gr.aueb.cf.cf9.ch5;

public class FmethodSwap5 {

    public static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }


    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.printf("x = %d,  y = %d %n", x, y);
        swap(x,y);

        System.out.printf("x = %d,  y = %d", x, y);
    }
}
