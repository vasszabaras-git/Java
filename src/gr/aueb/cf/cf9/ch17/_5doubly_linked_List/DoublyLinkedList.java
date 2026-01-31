package gr.aueb.cf.cf9.ch17._5doubly_linked_List;

public class DoublyLinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;

    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if (isEmpty()) tail = tmp;
        else head.setPrev(tmp);

        head = tmp;
    }

    /**
     * Time complexity O(1)
     * @param t
     */
    public void insertLast(T t) {
        if (isEmpty()) {
            insertFirst(t);
            return;
        }

        Node<T> tmp = new Node<>();
        tmp.setValue(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail.setNext(tmp);
        tail = tmp;
    }

    /**
     * Time complexity O(1).
     * @return
     */
    public Node<T> removeFirst() {
        if (isEmpty()) return null;               //empty list
        Node<T> nodeToReturn = head;              //store current head
        if (head.getNext() == null) tail = null;  //1node initially, list becomes empty
        head = head.getNext();
        if (head != null) head.setPrev(null);
        return nodeToReturn;
    }

    /**
     * Time complexity O(1).
     * @return
     */
    public Node<T> removeLast() {
        if (isEmpty() || head.getNext() == null) //empty or 1node only
            return removeFirst();

        Node<T> nodeToReturn = tail;
        tail = tail.getPrev();
        tail.setNext(null);
        return nodeToReturn;
    }

    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getValue().equals(t)) {        // equals should have been overriden in class T
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

    public void traverseReverse() {
        for (Node<T> n = tail; n != null; n = n.getPrev()) {
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