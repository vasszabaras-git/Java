package gr.aueb.cf.cf9.ch12_Data_and_PublicAPI;


public class main {

    public static void main(String[] args) {

        _1_Account aliceaccount = new _1_Account(1L, "GR1223", "alice", "W.", "A123", 100);

        try {
            aliceaccount.deposit(500);
            System.out.println(aliceaccount.accountToString());

            aliceaccount.withdraw(100, "A123");
            System.out.println(aliceaccount.accountToString());

            aliceaccount.withdraw(100, "A111111111");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
