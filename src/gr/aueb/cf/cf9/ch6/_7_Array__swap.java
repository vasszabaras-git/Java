package gr.aueb.cf.cf9.ch6;

public class _7_Array__swap {

    public static void swap( int[] arr){
        if (arr.length != 2) return;
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

//------------------------------------------------------
    public static void main(String[] args) {
        int [] array = new int[] {1,2};
        System.out.println(array[0]);
        System.out.println(array[1]);
        swap(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}
