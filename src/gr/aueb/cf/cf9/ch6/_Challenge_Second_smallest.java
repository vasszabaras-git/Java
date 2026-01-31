package gr.aueb.cf.cf9.ch6;

public class _Challenge_Second_smallest {
    public static void main(String[] args) {
        int [] array = {30,40,60,45, 7, 92, 12};
        int [] ordered = new int[array.length];
       for (int x : array){
           System.out.print(x + " ");
       }
        System.out.println(" ");
        ordered = order(array);
        for (int x : ordered){
            System.out.print(x + " ");
        }
    }

    public static int[] order (int [] arr) {

//-------
        for (int i = 0; i < arr.length; i++) {
            int max = i ;
            int tmp;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] >= arr[max]) {
                    max = j;
                }
            }
            tmp = arr[max];
            arr[max] = arr[i];
            arr[i] = tmp;
        }
    return arr;
    }
}
