package gr.aueb.cf.cf9.ch6;
//make a method that will populate the elemts of an array
public class Array_Traverse_5 {

    public static void main(String[] args) {

        int [] ages = new int[]{10, 20, 30};

        for ( int i : ages) {
            System.out.println( i );
        }
        System.out.println("--------------------------------");
        traverse( ages );
    }

    public static void traverse(int[] array ){
        for (int i : array){
            System.out.println(i);
        }
    }
}
