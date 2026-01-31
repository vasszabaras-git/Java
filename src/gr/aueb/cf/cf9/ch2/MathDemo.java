package gr.aueb.cf.cf9.ch2;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println("|-5| = " + Math.abs(-5));
        System.out.println(Math.min(1,10));
        System.out.println(Math.max(1,10));

        double tyxaio = Math.random();
        int number = (int) (tyxaio*10);

        System.out.printf("%f and %d %n",tyxaio, number);

        int die = 1 + (int) (tyxaio * 6); //1-6
        int d1320= 13 + (int)(tyxaio*(20-13+1)); //range (13-20)
        System.out.printf("die is %d,  d1320 is %d", die, d1320);
    }
}
