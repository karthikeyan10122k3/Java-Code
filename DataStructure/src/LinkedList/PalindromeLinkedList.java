package com.kar.practice.exercise.DataStructure.src.LinkedList;

import java.util.Objects;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.*;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.MiddleOfLinkedList.middleOfLinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node<Integer> LL = createLinkedList();
        System.out.print("Initial Linked List: ");
        printLinkedList(LL);

        palindromeLinkedList(LL);
    }

    private static void palindromeLinkedList(Node<Integer> head) {
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
        Node<Integer> middleNode  = middleOfLinkedList(head);

        // Checking Palindrome
        Node<Integer> before = head ;
        Node<Integer> current = head;
        Node<Integer> after = current.next;

        while (after !=null && after != middleNode) {
            current = after;
            after = after.next;
            current.next = before;
            before = current;
        }

        head.next = middleNode;
        head = current;

        System.out.print("Final Linked List: ");
        printLinkedList(head);

        current = head;

        if (count%2 == 1){
            middleNode = middleNode.next;
        }

        while (middleNode != null){

            if (!Objects.equals(current.data, middleNode.data)){
                System.out.println("FALSE!!");
                return ;
            }
            current = current.next;
            middleNode = middleNode.next;
        }
        System.out.println("TRUE!!");
    }
}
