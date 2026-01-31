package gr.aueb.cf.cf9.ch13_Only_PublicApi.Utilities;

public class Utility_Class {

    private Utility_Class(){};  // private constructor--no one outside this class can create an object of it.
                                // private means no code outside this class can call this constructor.

    public static void sayHello(){
        System.out.println("hello coding !!!");
    }
                                //static means the method belongs to the class itself, not to any object.
}





//The class is stateless — it does not hold any data, only provides reusable behavior.
//By combining private constructor + static methods, you enforce:
                    //No objects are created
                    //Methods are globally accessible
                    //Class is purely a public API for helpers