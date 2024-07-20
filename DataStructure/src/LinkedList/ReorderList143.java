package com.kar.practice.exercise.DataStructure.src.LinkedList;

import java.util.ArrayDeque;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.createLinkedList;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.printLinkedList;

public class ReorderList143 {
    public static void main(String[] args) {
        LinkedList.ListNode<Integer> LL = createLinkedList();
        System.out.print("Initial Linked List: ");
        printLinkedList(LL);
        reorderList(LL);
        System.out.print("Reordered Linked List: ");
        printLinkedList(LL);
    }

    public static void reorderList(LinkedList.ListNode<Integer> head) {
        if (head == null || head.next == null) {
            return;
        }

        ArrayDeque<LinkedList.ListNode<Integer>> deque = new ArrayDeque<>();
        LinkedList.ListNode<Integer> temp = head;

        while (temp != null) {
            deque.addLast(temp);
            temp = temp.next;
        }

        LinkedList.ListNode<Integer> dummy = new LinkedList.ListNode<>(0);
        temp = dummy;

        while (!deque.isEmpty()) {
            temp.next = deque.removeFirst();
            temp = temp.next;
            if (!deque.isEmpty()) {
                temp.next = deque.removeLast();
                temp = temp.next;
            }
        }
        temp.next = null;
    }
}
