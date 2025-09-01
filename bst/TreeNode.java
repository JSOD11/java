class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
    void setVal(int val) {
        this.val = val;
    }
    
    int getVal() {
        return val;
    }
    
    void setLeft(TreeNode node) {
        left = node;
    }
    
    TreeNode getLeft() {
        return this.left;
    }
    
    void setRight(TreeNode node) {
        right = node;
    }
    
    TreeNode getRight() {
        return this.right;
    }
    
    void print() {
        System.out.println("Val: " + val + ", Left: " + left + ", Right: " + right);
    }
}
