package gr.aueb.cf.cf9.ch2;

public class RandomDiceApp {

    public static void main(String[] args) {

        int die1;
        int die2;


        die1 = (int) (Math.random()*6 + 1);
        die2 = (int) (Math.random()*6 + 1);


        System.out.printf("dice are : %d %d", die1, die2);

    }
}
