package gr.aueb.cf.cf9.ch15_Interface._2lesson_composition.flexible;

public class School {

    private final ISpeakable x;

    public School(ISpeakable x){
        this.x = x;
    }

    public void learntospeak(){
        x.speak();
    }
}