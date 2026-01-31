package gr.aueb.cf.cf9.ch19_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _5_NonCapturing {

    public static void main(String[] args) {
        String s = "HelloWorld HelloWorld";

        Pattern pattern = Pattern.compile("(Hello)(?:World)"); //non capturing group
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
//            System.out.println(matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.print(matcher.group(i) + " ");
            }
            System.out.println();
        }
    }
}