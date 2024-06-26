package com.kar.practice.exercise.DataStructure.src.LinkedList;

import java.util.Objects;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.*;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.MiddleOfLinkedList.middleOfLinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode<Integer> LL = createLinkedList();
        System.out.print("Initial Linked List: ");
        printLinkedList(LL);

        palindromeLinkedList(LL);
    }

    private static void palindromeLinkedList(ListNode<Integer> head) {
        if(head == null ){
            System.out.println("FALSE!!");
            return;
        }
        if ( head.next ==null){
            System.out.println("TRUE!!");
            return;
        }

        // Getting Size of LL
        int count = getSize(head);

        // Getting MiddleNode of LL
        ListNode<Integer> middleListNode = middleOfLinkedList(head);

        // Checking Palindrome
        ListNode<Integer> before = head ;
        ListNode<Integer> current = head;
        ListNode<Integer> after = current.next;

        while (after !=null && after != middleListNode) {
            current = after;
            after = after.next;
            current.next = before;
            before = current;
        }

        head.next = middleListNode;
        head = current;

        System.out.print("Final Linked List: ");
        printLinkedList(head);

        current = head;

        if (count%2 == 1){
            middleListNode = middleListNode.next;
        }

        while (middleListNode != null){

            if (!Objects.equals(current.data, middleListNode.data)){
                System.out.println("FALSE!!");
                return ;
            }
            current = current.next;
            middleListNode = middleListNode.next;
        }
        System.out.println("TRUE!!");
    }
}
