package gr.aueb.cf.cf9.ch7;

public class _9_strings_toCharArray {

    public static void main(String[] args) {

        // Traverse as array
        String s = "Coding Factory";

        char[] geia = s.toCharArray(); //!!!!converts a String into a char[] array.

        for (char x : geia) {          //!!!! afou o geia einai char, to i that prepei na einai char
            System.out.print(x + " ");
        }
        System.out.println("\u2764");

        // Replace
        String firstname = "Maria-Helen";
        String simpleName = firstname.replace("-", " "); //garbage collector algorithm

        // Concat
        String lastname = "Smith";
        String fullName1 = firstname + " " + lastname;
        String fullName2 = firstname.concat(" ").concat(lastname);
    }
}