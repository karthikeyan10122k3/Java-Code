package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class InoderButWithNull {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,null,null,4,5};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        List<String> nodes = traverse(tree.root);

        StringBuilder serialized = new StringBuilder();
        for (String str: nodes){
            serialized.append(str);
        }
        System.out.println(nodes);

    }

    private static List<String> traverse(BinaryTree.TreeNode<Integer> root) {

        List<String> result = new ArrayList<>();
        if (root== null){
            result.add("null");
            return result;
        }

        result.add(String.valueOf(root.val));
        List<String> leftTree = traverse(root.left);
        List<String> rightTree = traverse(root.right);

        leftTree.addAll(rightTree);
        result.addAll(leftTree);

        return result;

    }
}
