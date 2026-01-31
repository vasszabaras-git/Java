package gr.aueb.cf.cf9.ch1;

//all imports outside the class
import java.util.Scanner;

public class SumFunction {

    // the function is always inside the main
    public static int functionSum(int a, int b, int c){
        return a+b+c;
    }


    public static void main(String[] args) {

        int [] usersInput = new int[3];

        Scanner k = new Scanner(System.in);
        System.out.print("1st nr: ");
        usersInput[0]= k.nextInt();
        System.out.print("2nd nr: ");
        usersInput[1]=k.nextInt();
        System.out.print("3rd nr: ");
        usersInput[2]=k.nextInt();
        k.close();

        System.out.println("sum is : " + functionSum(usersInput[0], usersInput[1], usersInput[2]));

    }
}
