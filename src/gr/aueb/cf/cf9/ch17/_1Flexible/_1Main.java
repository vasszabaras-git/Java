package gr.aueb.cf.cf9.ch17._1Flexible;

public class _1Main {

    public static void main(String[] args) {
        _1FlexibleNode flexibleNode = new _1FlexibleNode();

        flexibleNode.setValue("Coding");
        //this is String and the compiler doesnt see that i opt for int.class cast

        // No compile-time safety
        int value = (int) flexibleNode.getValue();

        System.out.println(value);
    }
}