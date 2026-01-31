package gr.aueb.cf.cf9.ch2;

public class IntApp {
    public static void main(String[] args) {

        int a =10;
        int b =10;
        int c =10;

        long d = 123_456_789;
        long e = 5000000000L;

        int mySum= a+b+c;
        long mySum2= a+b+c+d;
        long mySum3= a+b+c+d+e;

        System.out.printf("sum of: %d+%d+%d = " + mySum + " and not 32", a,b,c);
        System.out.println("");
        System.out.printf("type=%s, size=%d, min=%,d, max=%,d \n",
                Integer.TYPE, Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.printf("type=%s, size=%d, min=%,d, max=%,d \n",
                Byte.TYPE, Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);

        System.out.printf("type=%s, size=%d, min=%,d, max=%,d \n",
                Short.TYPE, Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("type=%s, size=%d, min=%,d, max=%,d \n",
                Long.TYPE, Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println("sum of 4 is = " + mySum2 );
        System.out.println("sum of 4 is = " + mySum3 );

    }

}
