package gr.aueb.cf.cf9.ch6;
// estw oti anaparistoume megalous akeraious s morfh pinaka
// kai prosthetoume 1. na mas dinei to apotelesma pali s pinaka
public class _17_Challenge_AddOne {
    public static void main(String[] args) {
    }
    /**
     * Προσθέτει τη μονάδα σε ένα πίνακα που αναπαριστά ένα ακέραιο.
     **/
    public static int[] addOne(int[] arr) {
        if (arr == null) return new int[0];
        int[] arrOut = new int[arr.length + 1];
        int sum = 0;
        int carry = 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            arrOut[0] = 1;
        }
        return arrOut;
    }
}
