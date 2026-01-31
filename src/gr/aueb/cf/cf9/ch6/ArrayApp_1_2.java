package gr.aueb.cf.cf9.ch6;

public class ArrayApp_1_2 {
    public static void main(String[] args) {

        int [] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 10;
        System.out.printf("arr0 = %d,  arr1 = %d,  arr2 = %d %n", arr[0], arr[1], arr[2]);


        int [] array = {11, 22, 33, 44};
        System.out.printf("a=%d b=%d c=%d d=%d %n", array[0], array[1], array[2], array[3]);


        int [] lastarray = new int[] {1,2,3}; //unsized initialization
        System.out.printf("a=%d b=%d c=%d %n", lastarray[0], lastarray[1], lastarray[2]);

        int [] finalarray ;    //array initializer
        finalarray = new int[] {1,2,3};
        System.out.printf("%d %d %d", finalarray[0], finalarray[1], finalarray[2]);


        int [] myarray = {1,2,3,4,5,6,7,8,9};
        System.out.println("---------------");
        System.out.println(myarray.length);
        System.out.println(myarray[myarray.length - 1]);
    }
}
