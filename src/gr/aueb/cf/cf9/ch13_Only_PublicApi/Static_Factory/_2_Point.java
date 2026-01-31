package gr.aueb.cf.cf9.ch13_Only_PublicApi.Static_Factory;

import java.util.Random;

public class _2_Point {

    private int x;
    private int y;

    public _2_Point(){}

    public _2_Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //static factory method
    //returns 1 instance
    //mporei n einai mazi h xwris tou constructors apo panw!
    //mporoume n elexoume to plithos twn instances

    public static _2_Point getInstance(){
        return new _2_Point();
    }

    public static _2_Point getRandomPoint(){
        final int BOUND = 101;
        Random random = new Random(System.nanoTime());
        //max-min+1 +1
        return new _2_Point(random.nextInt(BOUND) -1+1, random.nextInt(BOUND -1+1)+1);
    }


}
