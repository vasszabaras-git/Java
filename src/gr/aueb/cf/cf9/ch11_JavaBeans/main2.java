package gr.aueb.cf.cf9.ch11_JavaBeans;
public class main2 {

    public static void main(String[] args) {
        //100
        System.out.println("Number of Car objects created: " + Car.getCounter());

        Car toyota = new Car();
        Car nissan = new Car(1598L, "red", 2010, 20000.00);

        System.out.println(toyota.getCc() + " " + toyota.getColor() +" "+ toyota.getModel() +" "+ toyota.getPrice());

        toyota.setColor("green");
        toyota.setCc(1900L);
        toyota.setModel(2000);
        toyota.setPrice(13500.545789);

        System.out.println(toyota.getCc() + " " + toyota.getColor() +" "+ toyota.getModel() +" "+ toyota.getPrice());
        System.out.printf("the CC of the car is: %d, the color is: %s, the model: %d and the proce is: %.2f", toyota.getCc(), toyota.getColor(),toyota.getModel(),toyota.getPrice());
        System.out.println("Number of Car objects created: " + Car.getCounter());
    }
}
