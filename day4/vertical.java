package day4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class vertical {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class NodeWithColumn {
        TreeNode node;
        int column;

        NodeWithColumn(TreeNode node, int column) {
            this.node = node;
            this.column = column;
        }
    }

    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Map<Integer, List<Integer>> columnMap = new TreeMap<>();
        Queue<NodeWithColumn> queue = new LinkedList<>();
        queue.offer(new NodeWithColumn(root, 0));

        while (!queue.isEmpty()) {
            NodeWithColumn current = queue.poll();
            TreeNode node = current.node;
            int column = current.column;

            columnMap.putIfAbsent(column, new ArrayList<>());
            columnMap.get(column).add(node.val);

            if (node.left != null) {
                queue.offer(new NodeWithColumn(node.left, column - 1));
            }

            if (node.right != null) {
                queue.offer(new NodeWithColumn(node.right, column + 1));
            }
        }

        for (List<Integer> values : columnMap.values()) {
            result.add(values);
        }

        return result;
    }

    public static void printResult(List<List<Integer>> result) {
        for (List<Integer> column : result) {
            System.out.print("[ ");
            for (int value : column) {
                System.out.print(value + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        vertical solution = new vertical();
        List<List<Integer>> result = solution.verticalOrder(root);

        System.out.println("Vertical Order Traversal:");
        printResult(result);
    }
}
