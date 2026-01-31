package gr.aueb.cf.cf9.ch6;
// make an aray and populate all elements

public class ArrayPopulate3 {
    public static void main(String[] args) {

        int [] ages = new int[3];
        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 31;

        for (int i = 0; i < ages.length ; i++) {
            System.out.println(ages[i]);
        }

    }
}
