package gr.aueb.cf.cf9.ch19_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_DateMatcher {

    public static void main(String[] args) {
        String date = "06/12/2024; aaab 11/05/1999 xxx 02/27/2000";

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(date);

        while (matcher.find()){

            System.out.println(matcher.group());

            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            String grDate = String.format("%s/%s/%s", day, month, year);
//            String grDate1 = day + "/" + month + "/" + year;

            System.out.println(grDate);
//            System.out.println(grDate1);

            System.out.println("");
        }


    }
}
