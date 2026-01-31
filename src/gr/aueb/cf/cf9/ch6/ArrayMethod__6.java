package gr.aueb.cf.cf9.ch6;
// make 1 show method to give the elements of an array.
//make a 2nd overloaded method that takes low and high value to display
public class ArrayMethod__6 {

    public static void show( int[] array ){
        for (int i : array){
            System.out.println(i);
        }
    }

    public static void show( int[] array, int low, int high ){
        if (low < 0 || high > array.length){
            return;
        }
        if (low > high) {
            return;
        }
        for (int i = low; i <= high; i++){
            System.out.println( array [i]);
        }
    }

    public static int[] getarray() {
        return new int[4];
    }


///-------------------------------------
    public static void main(String[] args) {
        int [] ages = new int[] {10, 20, 30, 40, 45, 55, 77};

        show( ages );
        show( ages, 0,2);

        int [] arrr = getarray();
    }
}
