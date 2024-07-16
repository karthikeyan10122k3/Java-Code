package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

import com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList;

import java.util.Scanner;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.createLinkedList;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.printLinkedList;

public class ConvertSortedListToBinarySearchTree109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList.ListNode<Integer> LL = createLinkedList();
        System.out.print("Initial Linked List: ");
        printLinkedList(LL);

        BinarySearchTree.TreeNode<Integer> root = sortedListToBST(LL);
        displayTree(root, "", true);

    }

    public static BinarySearchTree.TreeNode<Integer> sortedListToBST(LinkedList.ListNode<Integer> head) {
        if (head == null){
            return null;
        }

        return sortedListToBSTHelper(head,null);
    }

    public static BinarySearchTree.TreeNode<Integer> sortedListToBSTHelper(LinkedList.ListNode<Integer> start , LinkedList.ListNode<Integer> end) {
        if (start == end){
            return null;
        }

        LinkedList.ListNode<Integer> mid = getMid(start,end);

        BinarySearchTree.TreeNode<Integer> rootNode = new BinarySearchTree.TreeNode<>(mid.data);

        rootNode.left = sortedListToBSTHelper(start, mid);
        rootNode.right = sortedListToBSTHelper(mid.next,end);
        return rootNode;
    }

    private static LinkedList.ListNode<Integer> getMid(LinkedList.ListNode<Integer> start,LinkedList.ListNode<Integer> end ) {

        if(start == end || start.next == end){
            return start;
        }
        LinkedList.ListNode<Integer> s = start;
        LinkedList.ListNode<Integer> f = start;

        while (f !=end && f.next != end){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    private static void displayTree(BinarySearchTree.TreeNode<Integer> treeNode, String indent, boolean isRight) {
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

        System.out.println(treeNode.val);
        displayTree(treeNode.left, indent, false);
        displayTree(treeNode.right, indent, true);
    }
}
