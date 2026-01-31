package gr.aueb.cf.cf9.ch13_Only_PublicApi.Static_Factory.mycoffee;

public class Coffee2 {

    private String type;
    private boolean sugar;

   /* public coffee2(){
        this.type = "espresso";
        this.sugar = false;
    }*/

   /* public coffee2(String type, boolean sugar){
        this.type = type;
        this.sugar = sugar;
    }*/

    private Coffee2(String type, boolean sugar){
        this.type = type;
        this.sugar = sugar;
    }

    public static Coffee2 classikos(){
        return new Coffee2("gr coffee", true);
    }

    public static Coffee2 custom(String type, boolean sugar){
        return new Coffee2(type, sugar);
    }

    public void drink() {
        System.out.println( type + " " + sugar);
    }

    @Override
    public String toString(){
        return type + " " + sugar;
    }

}
