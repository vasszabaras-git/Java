package gr.aueb.cf.cf9.ch13_Only_PublicApi.Singleton.mykitchen;


public class kitchen {

    private static final kitchen dish = new kitchen(); //dish cannot be reassigned.its a single object

    private kitchen() {}

    public static kitchen cook() {return dish;}

    public void wash(String food) {
        System.out.println("I wash the " + food);
    }
}