package gr.aueb.cf.cf9.ch16._2mycallbacks;
//from Greeter 1 greet method that takes a String

//create an instance (Greeter) (reprents the lambda)
//sayhello is reference to the object


public class Main {
    public static void main(String[] args) {

        Greeter sayhello = (x) -> System.out.println("hello " + x);
        sayhello.greet(6);


        Greeter giannis = Main::saygoodbye;
        giannis.greet(7);


    }

    //--------------
    public static void saygoodbye(int x){
        System.out.println("goodbye " + x);
    }
}
