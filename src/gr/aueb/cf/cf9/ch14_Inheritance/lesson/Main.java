package gr.aueb.cf.cf9.ch14_Inheritance.lesson;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point2D(2, 5.5);   //point sto stack, point 2d sto heap
        Point p3 = new Point3D(2, 5.5, 10);

        p1.movePlusOne();
        /*p2.movePlusOne();
        p3.movePlus10();

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);*/


        System.out.println(p1.toString());
        System.out.println(p1);
        /*System.out.println(p2);

        doPrint(p1);
        doPrint(p2);
        doPrint(p3);*/
    }
//polymorphism
    public static void doMovePlus10(Point p){
        p.movePlus10();  //late binding (i gets the appropriate during runtime
    }

    public static void doPrint(Point p){
        System.out.println(p.toString());
    }
}
