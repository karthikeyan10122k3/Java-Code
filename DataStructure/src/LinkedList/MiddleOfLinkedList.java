package com.kar.practice.exercise.DataStructure.src.LinkedList;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.createLinkedList;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.printLinkedList;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        LinkedList.ListNode<Integer> LL = createLinkedList();
        System.out.print("Initial Linked List: ");
        printLinkedList(LL);

        LinkedList.ListNode<Integer> middleListNode = middleOfLinkedList(LL);
        System.out.println("MiddleNode Data: "+ middleListNode.data);

    }

    public static LinkedList.ListNode<Integer> middleOfLinkedList(LinkedList.ListNode<Integer> head) {
        if(head == null || head.next ==null){
            return head;
        }
        LinkedList.ListNode<Integer> s = head;
        LinkedList.ListNode<Integer> f = head;

        while (f !=null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;

    }
}
