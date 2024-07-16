package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

public class IsPathExistsBetweenRootAndLeaf {

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,5,3,4,null,6};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        System.out.println(pathExists(tree.root,new int[]{1,2,4}));

    }

    private static boolean pathExists(BinaryTree.TreeNode<Integer> root, int[] path) {

        if (root == null){
            return false;
        }

        return pathExistsHelper(root,path,0);

    }

    private static boolean pathExistsHelper(BinaryTree.TreeNode<Integer> root, int[] path, int index) {

        if (root == null){
            return false;
        }
        if (index >= path.length || root.val != path[index]){
            return false;
        }
        if (root.left == null && root.right == null && index == path.length - 1 ){
            return true;
        }

        return pathExistsHelper(root.left, path, index + 1) || pathExistsHelper(root.right, path, index + 1);
    }

}
