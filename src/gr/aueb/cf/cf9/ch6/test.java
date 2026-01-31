package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 20 };
        int[] evens;

        evens = filterEven(arr);

        for (int el : evens) {
            System.out.println(el);
        }
    }

    public static int[] filterEven (int[] arr) {
        int[] evens = new int[arr.length];
        int count = 0;

        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evens[count++]=arr[i];
            }
        }
        evens = Arrays.copyOf(evens,count);
        return evens;
    }


}
