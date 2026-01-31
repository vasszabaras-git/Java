package gr.aueb.cf.cf9.ch11_JavaBeans;

public class _v_main {

    public static void main(String[] args) {

        //_v_Person:  class-blueprint, instructions
        //p1: object out of the blueprint
        //new: creates a new object in memory based on instructions
        _v_Person p1 = new _v_Person();
        _v_Person p2 = new _v_Person("Alice", 25);

        //here the getters are used to get the value from inside the class
        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p2.getName() +" "+ p2.getAge());

        p2.setName("Bob");
        p2.setAge(30);
        System.out.println(p2.getName() + " " + p2.getAge());
    }
}
