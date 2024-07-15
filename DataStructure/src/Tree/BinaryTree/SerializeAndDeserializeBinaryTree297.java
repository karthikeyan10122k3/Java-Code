package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SerializeAndDeserializeBinaryTree297 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,null,null,4,5};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        String serialized = serialize(tree.root);
        System.out.println(serialized);
        BinaryTree.TreeNode<Integer> root = deserialize(serialized);
        tree.displayTree(root);

    }
//     Encodes a tree to a single string.
public static String serialize(BinaryTree.TreeNode<Integer> root) {
    if (root == null) {
        return "";
    }
    List<String> nodes =  serializeHelper(root);;


    StringBuilder serialized = new StringBuilder();
    for (String str : nodes) {
        serialized.append(str).append(",");
    }

    if (!serialized.isEmpty()) {
        serialized.setLength(serialized.length() - 1);
    }
    return serialized.toString();
}

    public static List<String> serializeHelper(BinaryTree.TreeNode<Integer> root) {

        List<String> result = new ArrayList<>();
        if (root== null){
            result.add("null");
            return result;
        }

        result.add(String.valueOf(root.val));
        List<String> leftTree = serializeHelper(root.left);
        List<String> rightTree = serializeHelper(root.right);

        leftTree.addAll(rightTree);
        result.addAll(leftTree);

        return result;

    }

//     Decodes your encoded data to tree.
    public static BinaryTree.TreeNode<Integer> deserialize(String data) {

        List<String> deserializedList = new ArrayList<>(List.of(data.split(",")));
        Collections.reverse(deserializedList);
        BinaryTree.TreeNode<Integer> root = deserializeHelper(deserializedList);
        return root;
    }

    private static BinaryTree.TreeNode<Integer> deserializeHelper(List<String> desirializedList) {

        String val = desirializedList.remove(desirializedList.size() - 1);

        if (val.equals("null")){
            return null;
        }

        BinaryTree.TreeNode<Integer> node = new BinaryTree.TreeNode<>(Integer.parseInt(val));

        node.left = deserializeHelper(desirializedList);
        node.right = deserializeHelper(desirializedList);

        return node;

    }
}
