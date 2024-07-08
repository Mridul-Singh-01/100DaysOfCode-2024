
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTree {

    
    public static int height(TreeNode root) {
        if (root == null) {
            return -1; 
        }

      
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);

        System.out.println("Height of the tree: " + height(root)); 
    }
}
