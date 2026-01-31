package gr.aueb.cf.cf9.ch6;

public class ArrayMin_Max_10 {

    public static void main(String[] args) {
    int [] array;
    }

    public  static int getMin(int[] arr) {
        if (arr ==null || arr.length==0) return -1;

        int minPos =0;  //estw the 1st element is the min
        int minValue = arr[minPos];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minValue) {
                minPos = i;
                minValue = arr[i];
            }
        }
    return minPos;
    }


    public static int getMin2 (int[] arr) {
        if (arr ==null || arr.length < 1) return -1;

        int minPosition = 0; // estw
        int minvalue = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] < minvalue){
                minPosition = i;
                minvalue = arr[i];
            }
        }
        return minvalue;
    }

    public static int getMax(int[] arr) {
        if (arr ==null || arr.length < 1) return -1;

        int maxPos=0;
        int maxValue= arr[maxPos];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPos = i;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }


}
