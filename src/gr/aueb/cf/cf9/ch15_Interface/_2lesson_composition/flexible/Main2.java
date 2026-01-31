package gr.aueb.cf.cf9.ch15_Interface._2lesson_composition.flexible;
public class Main2 {

    public static void main(String[] args) {

        ISpeakable cat = new Cat("alice");
        ISpeakable dog = new Dog("bob", 10);

        School cattoschool = new School(cat);
        School dogtoschool = new School(dog);

        cattoschool.learntospeak();
        dogtoschool.learntospeak();
    }
}