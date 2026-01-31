package gr.aueb.cf.cf9.ch7;

/**
 * empty means no characters
 * null means no reference
 */
public class _12_strings_isEmpty{

    public static void main(String[] args) {
        String s1 = "Athens";
        String s3 = "";
        String s4 = null;          //is NOT string at all!!__it references nowhere!!
        boolean isEmpty;

        // isEmpty = s3.length() == 0;
        isEmpty = s3.isEmpty();


        System.out.println(s1);
        System.out.println("Length: " + s1.length());
        System.out.printf("City: %s\n", s1);
    }
}