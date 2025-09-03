class LRUTestDrive {
    public static void main(String[] args) {
        LRU lru = new LRU();
        
        System.out.print("\n\n————————————\n\n");
        System.out.print("Test basic puts and gets.\n\n");
        lru.print();
        lru.put(5, 3);
        lru.put(10, 2);
        lru.put(6, 1);
        lru.print();
        System.out.println(lru.get(5));
        System.out.println(lru.get(6));
        System.out.println(lru.get(100));
        lru.put(7, 20);
        lru.put(8, 123);
        
        System.out.print("\n\n————————————\n\n");
        System.out.print("Test interleaved removes and puts.\n\n");
        lru.print();
        lru.remove(6);
        lru.print();
        lru.remove(8);
        lru.put(100, 600);
        lru.put(-3, 5);
        lru.print();
        lru.remove(10);
        lru.print();
        lru.put(11, 11);
        lru.put(12, 12);
        lru.put(13, 13);
        
        System.out.print("\n\n————————————\n");
        System.out.print("Test LRU refresh functionality.\n\n");
        lru.print();
        lru.get(7);
        lru.print();
        lru.put(11, 1111);
        lru.print();
        
        System.out.print("\n\n————————————\n");
        System.out.print("Test LRU capacity functionality.\n\n");
        lru.printConcise();
        lru.put(13, 13);
        lru.put(14, 14);
        lru.put(15, 15);
        lru.put(16, 16);
        lru.put(17, 17);
        lru.printConcise();
        lru.put(18, 18);
        lru.printConcise();
        lru.put(19, 19);
        lru.printConcise();
        lru.put(20, 20);
        lru.printConcise();
    }
}