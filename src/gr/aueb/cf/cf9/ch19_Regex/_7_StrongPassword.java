package gr.aueb.cf.cf9.ch19_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _7_StrongPassword {

    public static void main(String[] args) {
        String s = "C0d1ngF@ct0ry";    //toulaxiston 12 characters, toulaxiston  1 lowercase, 1 uppercase, 1 special

        Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*])^.{12,}$");
        Matcher matcher = pattern.matcher(s);

        while   (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}