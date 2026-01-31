package gr.aueb.cf.cf9.ch14_Inheritance.myaccount;

public class bonus extends AddingInterest {
    private boolean iseligible;

    public bonus(double balance, double intrate, boolean iseligible) {
        super(balance, intrate);
        this.iseligible = iseligible;
    }

    @Override
    public void deposit(double newamount) {
        if (iseligible) {
            newamount = newamount + 100;
        }
        super.deposit(newamount);
    }
}