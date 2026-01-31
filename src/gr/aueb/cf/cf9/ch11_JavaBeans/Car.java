package gr.aueb.cf.cf9.ch11_JavaBeans;
// CC (L), color, model
public class Car {

   private static int counter=0;
    private long cc;
    private String color;
    private int model;
    private double price;


    static {counter = 0 ;
   }

    public Car() {
        counter ++;
    }

    public Car(long cc, String color, int model, double price) {
        this.cc = cc;
        this.color = color;
        this.model = model;
        this.price = price;
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

    public static void setCounter(int counter) {
        Car.counter = counter;
    }

    //getters
    public long getCc() {
        return cc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}