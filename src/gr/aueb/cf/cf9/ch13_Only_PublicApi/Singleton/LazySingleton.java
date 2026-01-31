package gr.aueb.cf.cf9.ch13_Only_PublicApi.Singleton;

public class LazySingleton {

    private static LazySingleton instance; // initially null

    private LazySingleton() {}   // private constructor → only one instance

    // Lazy Singleton
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // Public method of the singleton
    public void doSomething() {
        System.out.println("I am doing something");
    }
}
