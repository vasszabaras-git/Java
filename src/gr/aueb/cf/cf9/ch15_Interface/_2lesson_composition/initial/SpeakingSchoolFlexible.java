package gr.aueb.cf.cf9.ch15_Interface._2lesson_composition.initial;

//loosely coupled

public class SpeakingSchoolFlexible {

    private final ISpeakable xx;   //agnostic, doesnt do new //final:dependency cannot change after construction
    //we inject whatever is implemented by the interface

    //Dependency Injection
    // IoC - Inversion of Control
    public SpeakingSchoolFlexible (ISpeakable xx){
        this.xx = xx;
    }

    public void learnTospeak(){
        xx.speak();
    }
}


//marker interface--no method




