package gr.aueb.cf.cf9.ch15_Interface._1lesson_interface;

public class Cat implements ISpeakable {

    private String name;
    public Cat(){}

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(" meow! ");
    }
}
