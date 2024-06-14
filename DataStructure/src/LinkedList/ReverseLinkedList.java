package com.kar.practice.exercise.DataStructure.src.LinkedList;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.createLinkedList;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.printLinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node<Integer> LL = createLinkedList();
        System.out.print("Initial Linked List: ");
        printLinkedList(LL);

        reversLinkedList(LL);
    }

    private static void reversLinkedList(Node<Integer> head) {
        if(head == null  || head.next ==null){
            System.out.println(head);
            return;
        }

        Node<Integer> current = head;
        Node<Integer> before;
        Node<Integer> after = current.next;
        current.next = null;

        while ( after != null){
            before = current;
            current = after;
            after = after.next;
            current.next = before;

        }
        head = current;

        System.out.print("Final Linked List: ");
        printLinkedList(head);

    }
}
