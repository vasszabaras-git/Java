package gr.aueb.cf.cf9.ch13_Only_PublicApi.Singleton;

public class EagerInitilization {
    /*
     * Singleton Pattern (Eager Initialization)
     *  Only one instance of this class exists and is always returned.
     * The instance is created when the class is loaded.
     */

    private static final EagerInitilization instance = new EagerInitilization();// The single instance, created eagerly when the class is loaded

    private EagerInitilization() {} // Private constructor prevents creating other instances

    public static EagerInitilization getInstance() {    // Public method to access the single instance
        return instance;
    }

    // Example method of the singleton
    public void doSomething() {
        System.out.println("I am doing something");
    }

}
/*EagerInitilization eager1 = EagerInitilization.getInstance();
EagerInitilization eager2 = EagerInitilization.getInstance();
System.out.println("Are eager1 and eager2 the same object? " + (eager1 == eager2));
eager1.doSomething();
*/
