package com.kar.practice.exercise.DataStructure.src.LinkedList;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.*;

public class BubbleSortInLinkedList {
    public static void main(String[] args) {
            ListNode<Integer> LL = createLinkedList();
            System.out.println("Initial Linked List: ");
            printLinkedList(LL);

           bubbleSortInLinkedList(LL);

    }
    static void bubbleSortInLinkedList(ListNode<Integer> head){

        if (head == null){
            return;
        }
        boolean isRearranged ;
        ListNode<Integer> temp;
        ListNode<Integer> lastSortedListNodeData = null;

        do{

            isRearranged = false;
            temp = head;

            while(temp.next != lastSortedListNodeData){
                if(temp.data > temp.next.data){
                    int dummy = temp.next.data;
                    temp.next.data = temp.data;
                    temp.data = dummy;
                    isRearranged = true;
                }
                temp = temp.next;
            }
            lastSortedListNodeData = temp;

        } while (isRearranged);
        System.out.println("Sorted Linked List: ");
        printLinkedList(head);

    }
}
