package gr.aueb.cf.cf9.ch7;

public class _13_strings_split {

    public static void main(String[] args) {
        String s = "Athens       University of Economics      and Business";

        String[] tokens = s.split(" +");  // 1 h perissotera kena   // Regular expression

        for (String x : tokens) {
            System.out.println(x);
        }
    }
}





