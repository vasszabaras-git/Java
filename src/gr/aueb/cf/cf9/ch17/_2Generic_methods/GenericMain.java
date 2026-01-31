package gr.aueb.cf.cf9.ch17._2Generic_methods;

public class GenericMain {

    public static void main(String[] args) {
        GenericNode<String> mystring = new GenericNode<String>();//redundant
        GenericNode<Double> mydouble = new GenericNode<>();   // Στα generics, όχι primitives ως παραμετρικοί τύποι

        var z = new GenericNode<Integer>(); //better

        mystring.setValue("Hello");
        mydouble.setValue(10.5);

    }
}
