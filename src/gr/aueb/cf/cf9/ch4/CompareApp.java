package gr.aueb.cf.cf9.ch4;

import com.sun.security.jgss.GSSUtil;

public class CompareApp {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        boolean isGreater;

        System.out.println((int)a);
        System.out.println((int)b);

        isGreater = (a > b) ? true : false;
        System.out.println(isGreater);
    }
}
