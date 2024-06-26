package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

public class TraversalDisplay {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        BinarySearchTree.TreeNode<Integer> root = bst.insert(new Integer[]{50,30,20,40,10,25,70,60,80,75,100});

//        bst.displayTree();

        System.out.println("Pre-Order Traversal Display: ");
        preOrderDisplay(root, "",true);
        System.out.println();

        System.out.println("In-Order Traversal Display: ");
        inOrderDisplay(root,"",true);
        System.out.println();

        System.out.println("Post-Order Traversal Display: ");
        postOrderDisplay(root,"",true);


    }


    private static void preOrderDisplay(BinarySearchTree.TreeNode<Integer> treeNode, String indent, boolean isRight) {
        if (treeNode == null) {
            return;
        }

        System.out.print(indent);

        if (isRight) {
            System.out.print("R----");
            indent += "     ";
        } else {
            System.out.print("L----");
            indent += "|    ";
        }

        System.out.println(treeNode.value);
        preOrderDisplay(treeNode.left, indent, false);
        preOrderDisplay(treeNode.right, indent, true);
    }

    private static void inOrderDisplay(BinarySearchTree.TreeNode<Integer> treeNode, String indent, boolean isRight) {
        if (treeNode == null) {
            return;
        }

        inOrderDisplay(treeNode.left, indent + (isRight ? "     " : "|    "), false);

        System.out.print(indent);

        if (isRight) {
            System.out.print("R----");
        } else {
            System.out.print("L----");
        }

        System.out.println(treeNode.value);

        inOrderDisplay(treeNode.right, indent + (isRight ? "     " : "|    "), true);
    }

    private static void postOrderDisplay(BinarySearchTree.TreeNode<Integer> treeNode, String indent, boolean isRight) {
        if (treeNode == null) {
            return;
        }

        postOrderDisplay(treeNode.left, indent + (isRight ? "     " : "|    "), false);
        postOrderDisplay(treeNode.right, indent + (isRight ? "     " : "|    "), true);

        System.out.print(indent);

        if (isRight) {
            System.out.print("R----");
        } else {
            System.out.print("L----");
        }

        System.out.println(treeNode.value);
    }


}
