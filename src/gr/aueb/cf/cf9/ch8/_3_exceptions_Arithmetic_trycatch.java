import java.util.Scanner;
public class _3_exceptions_Arithmetic_trycatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        try {
            result = num1 / num2;
            System.out.println();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            // return; the return means exit the current method.means that main() is popped, the sout will not be executed
        }

        System.out.println("Result = " + result + "");  // This line will be executed
    }
}