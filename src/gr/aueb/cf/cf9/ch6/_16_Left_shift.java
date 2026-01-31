package gr.aueb.cf.cf9.ch6;

//does a shift by offset positions

public class _16_Left_shift {
    public static void main(String[] args) {
        int [] arr  = {1,5,71,9};
        //9,1,5,71
    }

    public static int[] shiftRight( int[] arr, int offset ) {
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];
        int [] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated [(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }

    public static int[] shiftLeft( int[] arr, int offset ) {
        //1574-> 5741
        if (arr == null) return new int[0];
        if (offset < 0) return new int[0];
        int [] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated [(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }


}
