package gr.aueb.cf.cf9.ch14_Inheritance.myaccount;
/*i deposit,
i add inteerst on the deposited amount
i get a bonus if i am eligible
i get les money if i am divorced
*/
public class Main {
    public static void main(String[] args) {

        Account ac1 = new Account(1000);
        System.out.println(ac1.getBalance());

        AddingInterest ac2 = new AddingInterest(1000, 0.1);
        ac2.deposit(500);
        System.out.println(ac2.getBalance());

        bonus ac3 = new bonus(1000, 0.1, true);
        ac3.deposit(500);
        System.out.println(ac3.getBalance());


    }
}