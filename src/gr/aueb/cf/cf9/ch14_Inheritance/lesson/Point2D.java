package gr.aueb.cf.cf9.ch14_Inheritance.lesson;

public class Point2D extends Point {             //derived class

    private double y;

    public Point2D(){
        //super(); automatically the default is called
        //y = 0;
    }

    public Point2D(double x, double y){
        super(x); //initialize the x edw kalei ton overloaded constructor
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //we can override the public and protected methods
    @Override
    public void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    public String toString() {
        return (") " + getX() + " ___ " + y + ")" );
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }
}
