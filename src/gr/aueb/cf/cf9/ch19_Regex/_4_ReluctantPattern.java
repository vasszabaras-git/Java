package gr.aueb.cf.cf9.ch19_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _4_ReluctantPattern {

    public static void main(String[] args) {
        String s = "login;alice;pass;12345;" ;

        Pattern pattern = Pattern.compile(".*?;");  //as little as possible
        Matcher matcher = pattern.matcher(s);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}