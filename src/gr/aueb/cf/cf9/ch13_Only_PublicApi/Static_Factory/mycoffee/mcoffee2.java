package gr.aueb.cf.cf9.ch13_Only_PublicApi.Static_Factory.mycoffee;

public class mcoffee2 {

    public static void main(String[] args){

 Coffee2 c1 = Coffee2.classikos();

 Coffee2 c2 = Coffee2.custom("martini", true);


 //c2.drink();
System.out.println(c2.toString());

    }
}

