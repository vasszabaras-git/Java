package gr.aueb.cf.cf9.ch19_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _6_LowerCaseAssert {

    public static void main(String[] args) {
        String s = "ASADWDWDWDWDWy";    //toulaxiston 8 characters, toulaxiston  lowercase

        Pattern pattern = Pattern.compile("(?=.*[a-z])^.{8,}$");
        Matcher matcher = pattern.matcher(s);

        while   (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
