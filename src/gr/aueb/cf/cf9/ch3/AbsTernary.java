package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * calculates the abs of an interger.
 * The abs(x) is >0
 */
public class AbsTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int result;
        System.out.println("give nr");
        a = scanner.nextInt();

        //if ( a < 0 ){
        //    result = -a;
        //}else {
        //    result = a;
        //}
        result = (a < 0 ) ? a : -a ;    //syntactic sugar

        System.out.println("abs of nr is "+ result);
    }
}
