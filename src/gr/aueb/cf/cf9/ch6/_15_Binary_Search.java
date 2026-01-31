package gr.aueb.cf.cf9.ch6;

public class _15_Binary_Search {
    public static void main(String[] args) {

    }



    public static int binarySearch( int[] array, int value, int low, int high){
        if (array==null) return -1;
        if(low<0 || high>array.length -1) return -1;
        if (low>high) return -1;

        int mid = (low + high) / 2;

        if (array[mid] == value) return mid;
        if (value>array[mid]) return binarySearch(array, value, mid+1, high);
        else return binarySearch(array, value, low, mid-1);

    }
}
