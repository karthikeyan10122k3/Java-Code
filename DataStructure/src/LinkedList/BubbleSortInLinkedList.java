package com.kar.practice.exercise.DataStructure.src.LinkedList;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.*;

public class BubbleSortInLinkedList {
    public static void main(String[] args) {
            LinkedList.Node<Integer> LL = createLinkedList();
            System.out.println("Initial Linked List: ");
            printLinkedList(LL);

           bubbleSortInLinkedList(LL);

    }
    static void bubbleSortInLinkedList(LinkedList.Node<Integer> head){

        if (head == null){
            return;
        }
        boolean isRearranged ;
        LinkedList.Node<Integer> temp;
        LinkedList.Node<Integer> lastSortedNodeData = null;

        do{

            isRearranged = false;
            temp = head;

            while(temp.next != lastSortedNodeData){
                if(temp.data > temp.next.data){
                    int dummy = temp.next.data;
                    temp.next.data = temp.data;
                    temp.data = dummy;
                    isRearranged = true;
                }
                temp = temp.next;
            }
            lastSortedNodeData = temp;

        } while (isRearranged);
        System.out.println("Sorted Linked List: ");
        printLinkedList(head);

    }
}
