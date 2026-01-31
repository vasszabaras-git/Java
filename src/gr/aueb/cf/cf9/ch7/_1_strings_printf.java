package gr.aueb.cf.cf9.ch7;

/**
 * {@link String}
 */
public class _1_strings_printf {
    public static void main(String[] args) {

        String s = "Athens";
        String s2 = "London";
        String s3 = "     thes xyz";


        System.out.println(s);
        System.out.printf("city =  %s \n", s);
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.equals(s2));
        System.out.println(s.replace("A", "N"));
        System.out.println(s3.trim());
        System.out.println(s3.strip());

        System.out.println(s3.concat(s));
    }
}
