class TreeNodeTestDrive {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(0, null, null);
        
        TreeNode right = new TreeNode(5, null, null);
        node.setRight(right);
        
        TreeNode left = new TreeNode(-10, null, null);
        node.setLeft(left);

        System.out.println(node.getVal());
        node.setVal(2);
        System.out.println(node.getVal());
        
        node.print();
        node.getRight().print();
        node.getLeft().print();
    }
}
