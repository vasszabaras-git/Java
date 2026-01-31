package gr.aueb.cf.cf9.ch13_Only_PublicApi.Singleton.mykitchen;

public class main_kitchen {

        public static void main(String[] args) {
            kitchen chef1 = kitchen.cook();
            kitchen chef2 = kitchen.cook();

            chef1.wash("pasta");
            chef2.wash("salad");

            System.out.println(chef1 == chef2); // true, same kitchen object

            lazykitchen chef3 = lazykitchen.cook();
        }
    }
