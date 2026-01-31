package gr.aueb.cf.cf9.ch14_Inheritance.myaccount;

public class Divorced extends bonus{

    private boolean isdivorced;


    public Divorced(double balance, double intrate, boolean iseligible, boolean isdivorced) {
        super(balance, intrate, iseligible);
        this.isdivorced = isdivorced;
    }

    @Override
    public void deposit (double amount) {
        if (isdivorced){
            amount = amount - 10;
        }
        super.deposit(amount);
    }

}
