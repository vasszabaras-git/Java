package gr.aueb.cf.cf9.ch15_Interface._5skeletal.lesson_Rectangle;

public class main {

    public static void main(String[] args) {

            Square s = new Square();
            s.setWidth(5);
            s.setHeight(5);

            System.out.println(s.getArea());      // 25
            System.out.println(s.getPerimeter()); // 20
            System.out.println(s.isSquare());     // t

    }
}
