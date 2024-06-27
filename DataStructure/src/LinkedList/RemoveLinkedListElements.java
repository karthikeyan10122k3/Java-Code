package com.kar.practice.exercise.DataStructure.src.LinkedList;

import java.util.Objects;
import java.util.Scanner;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.createLinkedList;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.printLinkedList;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList.ListNode<Integer> LL = createLinkedList();
        System.out.print("Initial Linked List: ");
        printLinkedList(LL);

        System.out.print("Enter Data to remove: ");
        int val  = sc.nextInt();

        removeLinkedListElements(LL,val);
    }

    private static void removeLinkedListElements(LinkedList.ListNode<Integer> head, int val) {
        if(head == null ){
            System.out.println(head);
            return;
        }

            LinkedList.ListNode<Integer> current = head;
//            Node<Integer> before;
//            Node<Integer> after = current.next;

            while (current.next != null) {
                if (Objects.equals(current.next.data,val)) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            if (head.data == val){
                head = head.next;
            }

        System.out.print("Final Linked List: ");
        printLinkedList(head);



    }
}
