package gr.aueb.cf.cf9.ch6;
// checks if it is symmetric

public class Array_symmetric_14 {
    public static void main(String[] args) {

     int[] array = {1,2,3,2,1};
     isSymmetric(array);

    }

    public static boolean isSymmetric(int[] arr) {
        boolean isSymm;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
              //  isSymm = false;
               // break;
                return false;
            }
        }
        return true;
    }
}
