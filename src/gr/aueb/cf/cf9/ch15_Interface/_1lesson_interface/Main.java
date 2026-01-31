package gr.aueb.cf.cf9.ch15_Interface._1lesson_interface;

public class Main {
    public static void main(String[] args) {

        ISpeakable c = new Cat("alice");
        Cat cat1 = new Cat("alice");
        ISpeakable d = new Dog("bob", 12);


        c.speak();
        d.speak();

        doSpeak(c);
        doSpeak(d);
    }


    public static void doSpeak(ISpeakable x){
        x.speak();}

}
