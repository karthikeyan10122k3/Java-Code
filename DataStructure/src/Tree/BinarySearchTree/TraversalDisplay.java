package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

public class TraversalDisplay {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        BinarySearchTree.Node<Integer> root = bst.insert(new Integer[]{50,30,20,40,10,25,70,60,80,75,100});

//        bst.displayTree();

//        traversal(root);
        System.out.println("Pre-Order Traversal Display: ");
        preOrderDisplay(root, "",true);
        System.out.println();

        System.out.println("In-Order Traversal Display: ");
        inOrderDisplay(root,"",true);
        System.out.println();

        System.out.println("Post-Order Traversal Display: ");
        postOrderDisplay(root,"",true);


    }


    private static void  preOrderDisplay(BinarySearchTree.Node<Integer> node, String indent, boolean isRight) {
        if (node == null) {
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

        System.out.println(node.value);
        preOrderDisplay(node.left, indent, false);
        preOrderDisplay(node.right, indent, true);
    }

    private static void inOrderDisplay(BinarySearchTree.Node<Integer> node, String indent, boolean isRight) {
        if (node == null) {
            return;
        }

        inOrderDisplay(node.left, indent + (isRight ? "     " : "|    "), false);

        System.out.print(indent);

        if (isRight) {
            System.out.print("R----");
        } else {
            System.out.print("L----");
        }

        System.out.println(node.value);

        inOrderDisplay(node.right, indent + (isRight ? "     " : "|    "), true);
    }

    private static void postOrderDisplay(BinarySearchTree.Node<Integer> node, String indent, boolean isRight) {
        if (node == null) {
            return;
        }

        postOrderDisplay(node.left, indent + (isRight ? "     " : "|    "), false);
        postOrderDisplay(node.right, indent + (isRight ? "     " : "|    "), true);

        System.out.print(indent);

        if (isRight) {
            System.out.print("R----");
        } else {
            System.out.print("L----");
        }

        System.out.println(node.value);
    }


}
