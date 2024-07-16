package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

public class KthSmallestElementInBST230 {
    static int count = 0;
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        BinarySearchTree.TreeNode<Integer> root = bst.insert(new Integer[]{3,1,4,null,2});
        bst.displayTree();
//        System.out.println(root.val);
        System.out.println(bst.getHeight(root.right));
//        System.out.println(kthSmallest(root,2));
    }
    public static int kthSmallest(BinarySearchTree.TreeNode<Integer> root, int k) {

        if (root == null){
            return 0;
        }

        int left =  kthSmallest(root.left, k );
        if (left != 0){
            return left;
        }
        count++;
        if (count == k){
            return root.val;
        }

        return kthSmallest(root.right, k);
    }
}
