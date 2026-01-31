package gr.aueb.cf.cf9.ch2;

public class Operations {
    public static void main(String[] args) {

        int n1=10;
        int n2=5;
        int sum=0, sub=0, div=0, mul=0, mod=0, result1=0, result2=0, result3=0, result4=0;

        sum = n1 + n2;
        sub = n1 + n2;
        div = n1 / n2;
        mul = n1 * n2;
        mod = n1 % n2;


        result1 = n1++;
        result2 = ++n1;
        result3 += n1; //res3=res3+n1
        result1++;     //res1=res1+1   res3 +=1

        System.out.printf("sum= %d\t, sub= %d\t, div= %d, mul= %d, mod= %d\n", sum, sub,div,mul, mod);
        System.out.printf("res1= %d, res2=%d, res3=%d",result1, result2, result3);
    }
}
