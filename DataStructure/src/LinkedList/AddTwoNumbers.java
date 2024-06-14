package com.kar.practice.exercise.DataStructure.src.LinkedList;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.createLinkedList;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.printLinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Node<Integer> LL1 = createLinkedList();

        Node<Integer> LL2 = createLinkedList();
        System.out.print("Initial Linked List 1: ");
        printLinkedList(LL1);
        System.out.print("Initial Linked List 2: ");
        printLinkedList(LL2);

        System.out.println("Final Linked List Slow Way: ");
        printLinkedList(addTwoNumbersSlowWay(LL1, LL2));
        System.out.println("Final Linked List Fast Way: ");
        printLinkedList(addTwoNumbersFastWay(LL1, LL2));

    }

    // Slow
    public static Node<Integer> addTwoNumbersSlowWay(Node<Integer> l1, Node<Integer> l2) {

        Node<Integer> addedListHead = new Node<>() ;
        Node<Integer> addedListTemp = addedListHead ;

        Node<Integer> temp1 = l1;
        Node<Integer> temp2 = l2;

        int sum ;

        int carry = 0;
        int value ;

        while ( temp1 != null && temp2 != null ){
            sum = carry + temp1.data + temp2.data;
            carry = 0;
            temp1 = temp1.next;
            temp2 = temp2.next;
            if (sum >= 10){
                carry = sum / 10;
                value = sum % 10;
            }else {
                value = sum;
            }
            addedListTemp.next = new Node<>(value);
            addedListTemp = addedListTemp.next;

        }
        while ( temp1 != null){
            sum = carry + temp1.data;
            carry = 0;
            temp1 = temp1.next;
            if (sum >= 10){
                carry = sum / 10;
                value = sum % 10;
            }else {
                value = sum;
            }
            addedListTemp.next = new Node<>(value);
            addedListTemp = addedListTemp.next;

        }

        while ( temp2 != null){
            sum = carry + temp2.data;
            carry = 0;
            temp2 = temp2.next;
            if (sum >= 10){
                carry = sum / 10;
                value = sum % 10;
            }else {
                value = sum;
            }
            addedListTemp.next = new Node<>(value);
            addedListTemp = addedListTemp.next;

        }
        System.out.println("Carry: "+ carry);


        if (carry != 0){
            addedListTemp.next = new Node<>(carry);
            addedListTemp = addedListTemp.next;
        }

        addedListTemp.next = null;


        return addedListHead.next;
    }

    //Fast
        public static Node<Integer> addTwoNumbersFastWay(Node<Integer> l1, Node<Integer> l2) {
            Node<Integer> dummyHead = new Node<>(0);
            Node<Integer> current = dummyHead;
            Node<Integer> temp1 = l1;
            Node<Integer> temp2 = l2;
            int carry = 0;

            while (temp1 != null || temp2 != null) {
                int x = (temp1 != null) ? temp1.data : 0;
                int y = (temp2 != null) ? temp2.data : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                current.next = new Node<>(sum % 10);
                current = current.next;
                if (temp1 != null) temp1 = temp1.next;
                if (temp2 != null) temp2 = temp2.next;
            }

            if (carry > 0) {
                current.next = new Node<>(carry);
            }

            return dummyHead.next;
        }

}
