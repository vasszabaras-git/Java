package gr.aueb.cf.cf9.ch6;

//sorts an array
//selection sort
//upopinakes
public class Matrix_selection_Sort_12 {

    public static void main(String[] args) {
        int[] array = {12, 9, 11, 7, 10};
        int[] sorted = new int [5];
        System.out.println("before");
        show(array);
        System.out.println();
        System.out.println("after");
        sorted = SelectionSort(array);
        show(sorted);
    }

    public static int[] SelectionSort(int[] arr){
        int minposition =0;
        int minValue;
        for (int i = 0; i < arr.length -1; i++){
            minposition = i; //estw sth thesh i
            minValue = arr[minposition];
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < minValue){
                    minposition = j;
                    minValue = arr[minposition];
                }
            }
            //swap now
            swap(arr, minposition, i);
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
