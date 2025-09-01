import java.util.ArrayList;
import java.util.HashSet;

public class Bst {
    TreeNode root;
    HashSet<Integer> values;
   
    private void init(int val) {
        root = new TreeNode(val, null, null);
        values = new HashSet<>();
        values.add(val);
    }
    
    public void add(int val) {
         if (root == null) {
            init(val);
            return;
        } else if (values.contains(val)) {
            return;
        }
        treeDfs(root, val);
    }
    
    // TODO: This only works for simple insertions, e.g. at leaves.
    private void treeDfs(TreeNode node, int val) {
        if (val < node.getVal()) {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode(val, null, null));
                return;
            }
            treeDfs(node.getLeft(), val);
        } else {
            if (node.getRight() == null) {
                node.setRight(new TreeNode(val, null, null));
                return;
            }
            treeDfs(node.getRight(), val);
        }
    }
    
    public void print() {
        if (root == null) { return; }
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        System.out.println(" ————— Tree ————— ");
        while (!queue.isEmpty()) {
            printQueue(queue);
            int N = queue.size();
            for (int i = 0; i < N; i++) {
                TreeNode node = queue.remove(0);
                TreeNode left = node.getLeft(), right = node.getRight();
                if (left != null) {
                    queue.add(left);
                }
                if (right != null) {
                    queue.add(right);
                }
            }
        }
        System.out.print(" ————— ———— ————— \n\n");
    }
    
    private void printQueue(ArrayList<TreeNode> queue) {
        for (TreeNode node : queue) {
            System.out.print(node.getVal() + " ");
        }
        System.out.println();
    }
}
