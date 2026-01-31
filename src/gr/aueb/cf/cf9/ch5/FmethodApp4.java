package gr.aueb.cf.cf9.ch5;

public class FmethodApp4 {


    public static int add(int a, int b){
        return a+b;
    }

    public static int factor(int a) {
        int res = 1;
        if (a==0) res=1;

        for (int i=1; i <= a ; i++) {
            res = res  * i;
        }

        return res;
    }

    public static void show() {
        System.out.println("geia");
        System.out.println("hello");
        System.out.println("hi hi");
    }


    public static void main(String[] args) {
    int x = add(6,7);
    int y = factor(4);
    int v = FmethodApp2.add(2,3);

    show();
    System.out.println(x);
    System.out.println("factorial is "+y);
    System.out.println(v);

        }
}
