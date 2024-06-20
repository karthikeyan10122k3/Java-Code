package com.kar.practice.exercise.DataStructure.src.LinkedList;

import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.createLinkedList;
import static com.kar.practice.exercise.DataStructure.src.LinkedList.LinkedList.printLinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        LinkedList.Node<Integer> LL1 = createLinkedList();

        LinkedList.Node<Integer> LL2 = createLinkedList();
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
    public static LinkedList.Node<Integer> addTwoNumbersSlowWay(LinkedList.Node<Integer> l1, LinkedList.Node<Integer> l2) {

        LinkedList.Node<Integer> addedListHead = new LinkedList.Node<>() ;
        LinkedList.Node<Integer> addedListTemp = addedListHead ;

        LinkedList.Node<Integer> temp1 = l1;
        LinkedList.Node<Integer> temp2 = l2;

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
            addedListTemp.next = new LinkedList.Node<>(value);
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
            addedListTemp.next = new LinkedList.Node<>(value);
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
            addedListTemp.next = new LinkedList.Node<>(value);
            addedListTemp = addedListTemp.next;

        }
        System.out.println("Carry: "+ carry);


        if (carry != 0){
            addedListTemp.next = new LinkedList.Node<>(carry);
            addedListTemp = addedListTemp.next;
        }

        addedListTemp.next = null;


        return addedListHead.next;
    }

    //Fast
        public static LinkedList.Node<Integer> addTwoNumbersFastWay(LinkedList.Node<Integer> l1, LinkedList.Node<Integer> l2) {
            LinkedList.Node<Integer> dummyHead = new LinkedList.Node<>(0);
            LinkedList.Node<Integer> current = dummyHead;
            LinkedList.Node<Integer> temp1 = l1;
            LinkedList.Node<Integer> temp2 = l2;
            int carry = 0;

            while (temp1 != null || temp2 != null) {
                int x = (temp1 != null) ? temp1.data : 0;
                int y = (temp2 != null) ? temp2.data : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                current.next = new LinkedList.Node<>(sum % 10);
                current = current.next;
                if (temp1 != null) temp1 = temp1.next;
                if (temp2 != null) temp2 = temp2.next;
            }

            if (carry > 0) {
                current.next = new LinkedList.Node<>(carry);
            }

            return dummyHead.next;
        }

}
