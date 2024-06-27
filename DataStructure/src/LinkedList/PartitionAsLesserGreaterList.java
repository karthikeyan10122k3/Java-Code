package com.kar.practice.exercise.DataStructure.src.LinkedList;

import java.util.Scanner;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.createLinkedList;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.printLinkedList;

public class PartitionAsLesserGreaterList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList.ListNode<Integer> LL = createLinkedList();
        System.out.print("Initial Linked List: ");
        printLinkedList(LL);

        System.out.print("Enter Value of X: ");
        int x = sc.nextInt();

        LinkedList.ListNode<Integer> partitionedListHead = partitionList(LL,x);
        printLinkedList(partitionedListHead);
    }

    public static LinkedList.ListNode<Integer> partitionList(LinkedList.ListNode<Integer> inputListHead, int x) {
        if (inputListHead == null || inputListHead.next == null){
            return inputListHead;
        }

        LinkedList.ListNode<Integer> xNode = new LinkedList.ListNode<>(x);

        LinkedList.ListNode<Integer> lesserValueNodeHead = new LinkedList.ListNode<>();
        LinkedList.ListNode<Integer> greaterValueNodeHead = new LinkedList.ListNode<>();

        LinkedList.ListNode<Integer> lesserValueNodeTemp = lesserValueNodeHead;
        LinkedList.ListNode<Integer> inputListTemp = inputListHead;

        boolean isFirstGreaterNode = true;

        while (inputListTemp != null){
             if (inputListTemp.data < x) {
                lesserValueNodeTemp.next = new LinkedList.ListNode<>(inputListTemp.data);
                lesserValueNodeTemp = lesserValueNodeTemp.next;
                lesserValueNodeTemp.next = xNode;
            } else if(inputListTemp.data > x){
                if (isFirstGreaterNode) {
                    xNode.next =  new LinkedList.ListNode<>(inputListTemp.data);
                    greaterValueNodeHead = xNode.next;
                    isFirstGreaterNode = false;
                }else {
                    greaterValueNodeHead.next = new LinkedList.ListNode<>(inputListTemp.data);
                    greaterValueNodeHead = greaterValueNodeHead.next;
                }
            }
            inputListTemp = inputListTemp.next;
        }

        return lesserValueNodeHead.next;
    }
}
