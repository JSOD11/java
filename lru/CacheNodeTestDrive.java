class CacheNodeTestDrive {
    public static void main(String[] args) {
        CacheNode node = new CacheNode(0, 0, null, null);
        System.out.println(node.key + " : " + node.val);
        CacheNode prev = new CacheNode(-10, -10, null, null);
        node.setPrev(prev);
        System.out.println(node.prev.key + " : " + node.prev.val);
        CacheNode next = new CacheNode(10, 10, null, null);
        node.setNext(next);
        System.out.println(node.next.key + " : " + node.next.val);
    }
}
