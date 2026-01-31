package gr.aueb.cf.cf9.ch6;
//looks for a value in a vector, returns -1 if doesnt exist

import java.util.Scanner;

public class Search_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        int value = 0;
        int position=0;
        System.out.println("value to search");
        value = scanner.nextInt();
        position = getPosition(arr, value);
        if (position == -1){
            System.out.println("wasnt found");
        }else{
            System.out.println("found at "+ (position +1) );
        }
    }
    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
    public static int getPosition2(int[] arr, int value) {
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
              return i;
            }
        }
        return -1;
    }
}
