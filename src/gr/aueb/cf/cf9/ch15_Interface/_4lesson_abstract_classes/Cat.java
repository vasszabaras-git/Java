package gr.aueb.cf.cf9.ch15_Interface._4lesson_abstract_classes;

//interfaces and abstarct classes similar
//difference:
// interfaces many implements
// abstract-extends A only
public class Cat extends Animal {


    @Override
    public void speak(){
        System.out.println("meow!");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("she ate all her food");
    }
}
