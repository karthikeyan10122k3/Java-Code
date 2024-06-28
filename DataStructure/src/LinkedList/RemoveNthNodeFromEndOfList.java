package com.kar.practice.exercise.DataStructure.src.LinkedList;

import java.util.Scanner;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.createLinkedList;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.printLinkedList;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        LinkedList.ListNode<Integer> LL = createLinkedList();
        System.out.print("Initial Linked List: ");
        printLinkedList(LL);

        System.out.print("Enter BinaryTreeNode Index To Remove: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList.ListNode<Integer> resultHeadLL = removeNthFromEnd(LL,n);
        printLinkedList(resultHeadLL);
    }

    private static LinkedList.ListNode<Integer> removeNthFromEnd(LinkedList.ListNode<Integer> head,int n) {


        LinkedList.ListNode<Integer> reversedLLHead = reverseLinkedList(head);
        LinkedList.ListNode<Integer> removedLLHead = removeNthLinkedListElements(reversedLLHead,n);


        return reverseLinkedList(removedLLHead);

    }


    private static LinkedList.ListNode<Integer> reverseLinkedList(LinkedList.ListNode<Integer> head) {

        if(head == null  || head.next ==null){
            return head;
        }

        LinkedList.ListNode<Integer> current = head;
        LinkedList.ListNode<Integer> before;
        LinkedList.ListNode<Integer> after = current.next;
        current.next = null;

        while ( after != null){
            before = current;
            current = after;
            after = after.next;
            current.next = before;

        }
        head = current;

        return head;

    }

    private static LinkedList.ListNode<Integer> removeNthLinkedListElements(LinkedList.ListNode<Integer> head, int index) {
        if(index == 1){
            return head.next;
        }
        if(head == null  || head.next == null){
            return head;
        }


        LinkedList.ListNode<Integer> current = head;
        int count = 1;

        while (current.next != null) {
            if (count == index - 1) {
                current.next = current.next.next;
                return head;
            } else {
                current = current.next;
            }
            count++;
        }

        return head;

    }
}
