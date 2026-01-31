package gr.aueb.cf.cf9.ch17._4_hash_equals;

public class Main {

    public static void main(String[] args) {
        /*Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 5);

        System.out.println(p1.equals(p2));

*/

        Point p3 = new Point(1, 2);
        Point p4 = new Point(1, 2);

        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
/*
        System.out.println(p1.getX() + ", " + p1.getY());
        System.out.println(p2.getX() + ", " + p2.getY());*/
    }
}