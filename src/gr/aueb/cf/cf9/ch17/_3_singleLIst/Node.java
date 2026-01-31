package gr.aueb.cf.cf9.ch17._3_singleLIst;
//Node<String> n;  n can only hold String values
//Node<String> n = new Node<>();  compiler knows T = String
//Node<T> tmp = new Node<>();  tmp → reference to a Node storing type T
//                              new Node<>() → creates the actual object in memory
public class Node<T> {
    private T value;              //private int item;
    private Node<T> next;       //next is a variable that holds a reference (address) to a Node<T> object
                                 //Node<T> is a reference
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
