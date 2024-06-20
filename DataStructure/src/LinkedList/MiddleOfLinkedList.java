package com.kar.practice.exercise.DataStructure.src.LinkedList;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.createLinkedList;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.printLinkedList;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        LinkedList.Node<Integer> LL = createLinkedList();
        System.out.print("Initial Linked List: ");
        printLinkedList(LL);

        LinkedList.Node<Integer> middleNode = middleOfLinkedList(LL);
        System.out.println("MiddleNode Data: "+middleNode.data);

    }

    public static LinkedList.Node<Integer> middleOfLinkedList(LinkedList.Node<Integer> head) {
        if(head == null || head.next ==null){
            return head;
        }
        LinkedList.Node<Integer> s = head;
        LinkedList.Node<Integer> f = head;

        while (f !=null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;

    }
}
