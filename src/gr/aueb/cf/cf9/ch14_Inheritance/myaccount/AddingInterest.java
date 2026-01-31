package gr.aueb.cf.cf9.ch14_Inheritance.myaccount;

public class AddingInterest extends Account {

    private double intrate;

    public AddingInterest(double balance, double intrate) {
        super(balance);
        this.intrate = intrate;
    }

    @Override
    public void deposit(double amount){
        amount = amount * (1+intrate);
        super.deposit(amount);
    }
}
