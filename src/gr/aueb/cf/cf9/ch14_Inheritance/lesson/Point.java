package gr.aueb.cf.cf9.ch14_Inheritance.lesson;

public class Point {
    private double x;

    public Point(){};

    public Point(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + x + "  )";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void movePlusOne(){
        x +=1 ;
    }

    public void movePlus10(){
        x += 10;
    }

    private void reset(){
        x = 0;
    }
}
