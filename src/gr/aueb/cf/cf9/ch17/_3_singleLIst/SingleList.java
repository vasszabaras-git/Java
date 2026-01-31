package gr.aueb.cf.cf9.ch17._3_singleLIst;
//Node<String> n;                  n can only hold String values
//Node<String> n = new Node<>();  compiler knows T = String
//Node<T> tmp = new Node<>();     tmp → reference to a Node storing type T
//                                new Node<>() → creates the actual object in memory


public class SingleList<T> {           //me generics
    private Node<T> head = null;     //initially points to nothing, list is empty

    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setNext(head);
        head = tmp;
    }

    public void insertLast(T t) {
        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setNext(null);

        if (isEmpty()) {
            insertFirst(t);
            return;
        }

        Node<T> n;             //n=reference
        for (n = head; n.getNext() != null; n = n.getNext());
        n.setNext(tmp);         //link with last i created above
    }

    public Node<T> removeFirst() {
        if (isEmpty()) return null;
        Node<T> tmp = head;         //points to the 1st node
        head = head.getNext();
        return tmp;
    }

    public Node<T> removeLast() {

        // if the list is empty or has only one element
        if (isEmpty() || head.getNext() == null) {
            return removeFirst();
        }

        Node<T> n;
        for (n = head; n.getNext().getNext() != null; n = n.getNext()) {}

        Node<T> nodeToReturn = n.getNext();
        n.setNext(null);
        return nodeToReturn;
    }

    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getValue().equals(t)) {
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }

    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getValue());
        }
    }

    public int size() {
        int counter = 0;
        for (Node<T> n = head; n != null; n = n.getNext()) {
            counter++;
        }
        return counter;
    }

    public boolean isEmpty() {
        return head == null;
    }
}