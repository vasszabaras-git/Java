package gr.aueb.cf.cf9.ch6;

public class _Challenge_getMaxPosition {

    public static void main(String[] args) {
        int array[] = {1, 7, 423, 10, 41, 2, 40};
        System.out.println(getMaxPosition(array));
    }

    public static int getMaxPosition(int[] arr) {
        int maxPos = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= arr[maxPos]) {
                maxPos = i;
            }
        }
        return maxPos;
    }

}