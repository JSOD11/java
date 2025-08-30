public class LinkedList {
    private final Node sentinel;
    
    LinkedList() {
        sentinel = new Node(0, null);
    }
    
    public void Append(int value) {
        Node n = sentinel;
        while (n.getNext() != null) {
            n = n.getNext();
        }
        n.setNext(new Node(value, null));
    }
    
    public boolean Contains(int value) {
        Node n = sentinel.getNext();
        if (n == null) {
            return false;
        }
        while (n != null) {
            if (n.getValue() == value) {
                return true;
            }
            n = n.getNext();
        }
        return false;
    }
    
    public int Size() {
        Node n = sentinel;
        int size = 0;
        while (n.getNext() != null) {
            n = n.getNext();
            size++;
        }
        return size;
    }
    
    public boolean IsEmpty() {
        return sentinel.getNext() == null;
    }
    
    public void Remove(int value) {
        Node n = sentinel;
        while (n.getNext() != null) {
            if (n.getNext().getValue() == value) {
                n.setNext(n.getNext().getNext());
                return;
            }
            n = n.getNext();
        }
    }
    
    public void PrintList() {
        Node n = sentinel.getNext();
        while (n.getNext() != null) {
            System.out.print(n.getValue() + " -> ");
            n = n.getNext();
        }
        System.out.println(n.getValue());
    }
}
