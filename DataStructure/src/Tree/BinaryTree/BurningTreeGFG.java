package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BurningTreeGFG {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,4,5,null,6,null,null,7,8,null,9,null,null,null,null,null,10};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        System.out.println(minTimeToBurn(tree.root,8));

    }

    private static HashMap<BinaryTree.TreeNode<Integer>, BinaryTree.TreeNode<Integer>> parentMap = new HashMap<>();

    public static int minTimeToBurn(BinaryTree.TreeNode<Integer> root, int target) {
        if (root == null) return 0;

        BinaryTree.TreeNode<Integer> targetNode = populateParentMap(root, target);

        return bfsToBurnTree(targetNode);
    }

    private static BinaryTree.TreeNode<Integer> populateParentMap(BinaryTree.TreeNode<Integer> root, int target) {
        Queue<BinaryTree.TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        BinaryTree.TreeNode<Integer> targetNode = null;

        while (!queue.isEmpty()) {
            BinaryTree.TreeNode<Integer> current = queue.poll();

            if (current.val == target) {
                targetNode = current;
            }

            if (current.left != null) {
                parentMap.put(current.left, current);
                queue.add(current.left);
            }

            if (current.right != null) {
                parentMap.put(current.right, current);
                queue.add(current.right);
            }
        }
        return targetNode;
    }

    private static int bfsToBurnTree(BinaryTree.TreeNode<Integer> targetNode) {
        Queue<BinaryTree.TreeNode<Integer>> queue = new LinkedList<>();
        HashSet<BinaryTree.TreeNode<Integer>> visited = new HashSet<>();
        queue.add(targetNode);
        visited.add(targetNode);
        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean fireSpread = false;

            for (int i = 0; i < size; i++) {
                BinaryTree.TreeNode<Integer> current = queue.poll();

                if (current.left != null && !visited.contains(current.left)) {
                    queue.add(current.left);
                    visited.add(current.left);
                    fireSpread = true;
                }

                if (current.right != null && !visited.contains(current.right)) {
                    queue.add(current.right);
                    visited.add(current.right);
                    fireSpread = true;
                }

                if (parentMap.containsKey(current) && !visited.contains(parentMap.get(current))) {
                    queue.add(parentMap.get(current));
                    visited.add(parentMap.get(current));
                    fireSpread = true;
                }
            }

            if (fireSpread) {
                time++;
            }
        }
        return time;
    }

}
