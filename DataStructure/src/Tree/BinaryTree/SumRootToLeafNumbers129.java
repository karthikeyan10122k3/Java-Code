package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.ArrayList;

public class SumRootToLeafNumbers129 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        System.out.println(sumNumbers(tree.root));

    }
    public static int sumNumbers(BinaryTree.TreeNode<Integer> root) {

        if (root == null){
            return 0;
        }
        ArrayList<String> rootToLeaf = sumNumberHelper(root,"",new ArrayList<>());
        int sum = 0;
        for (String str: rootToLeaf){
            sum += Integer.parseInt(str);
        }
        return sum;
    }

    private static ArrayList<String> sumNumberHelper(BinaryTree.TreeNode<Integer> root, String s, ArrayList<String> rootLeafList) {
        if (root == null){
            return rootLeafList;
        }

        s += String.valueOf(root.val);
        if (root.left == null && root.right == null){
            rootLeafList.add(s);
            return rootLeafList;
        }

        sumNumberHelper(root.left, s, rootLeafList);
        sumNumberHelper(root.right, s, rootLeafList);

        return rootLeafList;
    }
}
