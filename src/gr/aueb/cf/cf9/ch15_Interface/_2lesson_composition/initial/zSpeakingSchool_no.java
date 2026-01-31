package gr.aueb.cf.cf9.ch15_Interface._2lesson_composition.initial;

import gr.aueb.cf.cf9.ch15_Interface._1lesson_interface.Cat;

public class zSpeakingSchool_no {
//tightly coupled!!!trains only cats. not dogs

    private final Cat cat = new Cat();
    private final Cat cat2 = new Cat();
    //composition: private instance of class Cat...final is the reference here, not the data of teh instance in the heap. the cat can change


    public zSpeakingSchool_no(){}

    public  void  learnToSpeak(){
        cat.speak();
    }
}
