package gr.aueb.cf.cf9.ch17._1Flexible;

/**
 * Στη θέση του Object μπορεί να έχουμε
 * οποιονδήποτε τύπο δεδομένων.
 */

public class _1FlexibleNode {
    private Object value;

    public _1FlexibleNode() {}

    public _1FlexibleNode(Object value) {
        this.value = value;
    }


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}