package day4;

public class Invert {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args) {
        Invert invert = new Invert();
        TreeNode root = invert.new TreeNode(1);
        root.left = invert.new TreeNode(2);
        root.right = invert.new TreeNode(3);
        root.left.left = invert.new TreeNode(4);
        root.left.right = invert.new TreeNode(5);

        System.out.println("Original tree:");
        invert.printTree(root);
        System.out.println();

        TreeNode invertedRoot = invert.invertTree(root);
        System.out.println("Inverted tree:");
        invert.printTree(invertedRoot);
    }
}
