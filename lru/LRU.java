import java.util.HashMap;

public class LRU {
    private CacheNode sentinel;
    private CacheNode tail;
    private HashMap<Integer, CacheNode> map;
    private final int CAPACITY = 10;
    
    LRU() {
        sentinel = new CacheNode(0, 0, null, null);
        tail = sentinel;
        map = new HashMap<>();
        assert CAPACITY > 0;
    }
    
    int get(int key) {
        if (map.containsKey(key)) {
            CacheNode node = map.get(key);
            refresh(key, node.val);
            return node.val;
        }
        return -1;
    }
    
    void put(int key, int val) {
        if (key < 0 || val < 0) {
            System.out.println("Keys and values must be positive.");
            return;
        } else if (map.containsKey(key)) {
            refresh(key, val);
            return;
        }
        tail.setNext(new CacheNode(key, val, null, null));
        tail = tail.next;
        map.put(key, tail);
        
        maintainCapacity();
    }
    
    void remove(int key) {
        CacheNode node = map.get(key);
        if (node == null) {
            return;
        }
        if (node == tail) {
            tail = node.prev;
        }
        node.prev.setNext(node.next);
        map.remove(key);
    }
    
    private void refresh(int key, int val) {
        remove(key);
        put(key, val);
    }
    
    private void maintainCapacity() {
        while (map.size() > CAPACITY) {
            remove(sentinel.next.key);
        }
    }
    
    void print() {
        CacheNode node = sentinel.next;
        if (node == null) {
            System.out.println("Cache is empty.");
            return;
        }
        while (node.next != null) {
            System.out.print("(" + node.key + ", " + node.val + ") -> ");
            node = node.next;
        }
        System.out.println("(" + node.key + ", " + node.val + "). Tail: " + "(" + tail.key + ", " + tail.val + ")");
    }
    
    void printConcise() {
        CacheNode node = sentinel.next;
        if (node == null) {
            System.out.println("Cache is empty.");
            return;
        }
        while (node.next != null) {
            System.out.print(node.key + " - ");
            node = node.next;
        }
        System.out.println(node.key + ". T: " + tail.key + ", L: " + map.size());
    }
}
