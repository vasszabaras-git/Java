package gr.aueb.cf.cf9.ch13_Only_PublicApi.Singleton.mykitchen;

public class lazykitchen {

    private static lazykitchen dish; // initially null

    private lazykitchen() {}

    public static lazykitchen cook() {
        if (dish == null) {
            dish = new lazykitchen(); // create only on the 1st call
        }
        return dish;
    }

    public void wash(String food) {
        System.out.println("I wash the " + food);
    }
}