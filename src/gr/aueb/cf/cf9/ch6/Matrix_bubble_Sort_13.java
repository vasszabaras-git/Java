package gr.aueb.cf.cf9.ch6;

public class Matrix_bubble_Sort_13 {
    public static void main(String[] args) {
        int [] array = {12, 9, 11, 7, 4};
        int[] sorted = new int [5];
        System.out.println("before");
        show(array);
        System.out.println();
        System.out.println("after");
        sorted = bubblesort(array);
        show(sorted);
    }


    public static int[] bubblesort(int[] arr){

        for (int i = arr.length -1; i > 0; i--) {
            for (int j =0; j < i; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void swap (int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void show( int[] array ){
        for (int i : array){
            System.out.println(i);
        }
    }
}
