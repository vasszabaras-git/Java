package gr.aueb.cf.cf9.ch7;

public class _18_charCount {

    public static void main(String[] args) {

    }

    public static int countChars(String str) {
        if (str == null) return 0;                 //o deikths na mhn einai null
        return str.length();
    }
}