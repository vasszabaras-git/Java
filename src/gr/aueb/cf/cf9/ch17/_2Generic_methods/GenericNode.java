package gr.aueb.cf.cf9.ch17._2Generic_methods;

public class GenericNode<T> {
    private T value;


    //constructors
    public GenericNode() {}
    public GenericNode(T value) {
        this.value = value;
    }

    //getter setter
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}