package kuchbhi;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BST {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

    public static void main(String[] args) {
        BST bst = new BST();

        TreeNode root = null;
        root = bst.insertIntoBST(root, 4);
        root = bst.insertIntoBST(root, 2);
        root = bst.insertIntoBST(root, 7);
        root = bst.insertIntoBST(root, 5);

        System.out.println("BST insertion completed successfully!");
    }
}
