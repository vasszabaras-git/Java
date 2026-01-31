package gr.aueb.cf.cf9.ch11_JavaBeans;

public class _v_Person {


    // fields (instance variables)
    private String name;
    private int age;

    //default constructor no parameters
    public _v_Person(){
    }

    //parametrized constructor
    public _v_Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }


}
