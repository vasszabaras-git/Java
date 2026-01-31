package gr.aueb.cf.cf9.ch13_Only_PublicApi.Singleton;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Lazy Singleton ===");
        // Lazy instance is created only when getInstance() is called
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("Are lazy1 and lazy2 the same object? " + (lazy1 == lazy2));
        lazy1.doSomething();

        System.out.println("\n=== Eager Singleton ===");
        // Eager instance was created when the class loaded
        EagerInitilization eager1 = EagerInitilization.getInstance();
        EagerInitilization eager2 = EagerInitilization.getInstance();

        System.out.println("Are eager1 and eager2 the same object? " + (eager1 == eager2));
        eager1.doSomething();
    }

}
