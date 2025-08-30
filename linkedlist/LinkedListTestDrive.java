class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        System.out.println(ll.IsEmpty());
        
        ll.Append(5);
        ll.Append(6);
        ll.Append(7);
        ll.Append(8);
        ll.Append(9);
        
        ll.PrintList();
        
        System.out.println(ll.Contains(7));
        System.out.println(ll.Contains(1));
        System.out.println(ll.Contains(9));
        
        System.out.println(ll.Size());
        System.out.println(ll.IsEmpty());
        
        ll.Remove(6);
        ll.PrintList();
        ll.Remove(8);
        ll.PrintList();
        ll.Remove(5);
        ll.PrintList();
    }
}
