class NodeTestDrive {
    public static void main(String[] args) {
        Node node = new Node(0, null);
        System.out.println(node.getValue());
        System.out.println(node.getNext());
        
        node.setValue(10);
        Node next = new Node(5, null);
        node.setNext(next);
        
        System.out.println(node.getValue());
        System.out.println(node.getNext().getValue());
    }
}
