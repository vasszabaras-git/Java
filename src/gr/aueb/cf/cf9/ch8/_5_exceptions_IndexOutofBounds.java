package gr.aueb.cf.cf9.ch8;

public class _5_exceptions_IndexOutofBounds {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};


        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]); // print array elements
        }
    }

}
