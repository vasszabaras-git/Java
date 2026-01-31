package gr.aueb.cf.cf9.ch17._4_hash_equals;

import java.util.Objects;

public class Point {
    private int x;
    private int y;
     //constructors
    public Point() {    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getters setters
    public int getX() {return x;}
    public void setX(int x) {this.x = x;}
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;    //if both references point to the same object in memory.
        if (!(other instanceof Point point)) return false;
        return this.getX() == point.getX() && getY() == point.getY();  //here compares values
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());    //can be x & y instead of getters; eimaste mesa sth classh
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}