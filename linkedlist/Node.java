class Node {
    private int value;
    private Node next;
    
    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
    
    void setValue(int v) {
        value = v;
    }
    
    int getValue() {
        return value;
    }
    
    void setNext(Node n) {
        next = n;
    }
    
    Node getNext() {
        return next;
    }
}
