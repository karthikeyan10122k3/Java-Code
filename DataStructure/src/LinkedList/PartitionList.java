package com.kar.practice.exercise.DataStructure.src.LinkedList;

//https://leetcode.com/problems/partition-list/description/

import java.util.Scanner;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.createLinkedList;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.printLinkedList;

public class PartitionList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList.ListNode<Integer> LL = createLinkedList();
        System.out.print("Initial Linked List: ");
        printLinkedList(LL);

        System.out.print("Enter Value of X: ");
        int x = sc.nextInt();

        LinkedList.ListNode<Integer> partitionedListHead = partition(LL,x);
        printLinkedList(partitionedListHead);
    }

    private static LinkedList.ListNode<Integer> partition(LinkedList.ListNode<Integer> inputListHead, int x) {

        LinkedList.ListNode<Integer> lesserValueNodeHead = new LinkedList.ListNode<>();
        LinkedList.ListNode<Integer> greaterValueNodeHead = new LinkedList.ListNode<>();
        LinkedList.ListNode<Integer> lesserValueNodeTemp = lesserValueNodeHead;
        LinkedList.ListNode<Integer> greaterValueNodeTemp = greaterValueNodeHead;

        while (inputListHead != null){

            if (inputListHead.data < x) {
                lesserValueNodeTemp.next = inputListHead;
                lesserValueNodeTemp = inputListHead;
            } else {
                greaterValueNodeTemp.next = inputListHead;
                greaterValueNodeTemp = inputListHead;
            }
            inputListHead = inputListHead.next;
        }
        greaterValueNodeTemp.next = null;
        lesserValueNodeTemp.next = greaterValueNodeHead.next;
        return lesserValueNodeHead.next;
    }
}
