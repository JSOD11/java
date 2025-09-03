class CacheNode {
    int key;
    int val;
    CacheNode next;
    CacheNode prev;
    
    CacheNode(int k, int v, CacheNode n, CacheNode p) {
        key = k;
        val = v;
        next = n;
        prev = p;
    }

    void set(int k, int v) {
        key = k;
        val = v;
    }

    void setNext(CacheNode n) {
        next = n;
        if (n != null) {
            n.prev = this;
        }
    }

    void setPrev(CacheNode n) {
        prev = n;
        n.next = this;
    }
}
