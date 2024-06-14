package com.kar.practice.exercise.DataStructure.src.LinkedList;

import java.util.Scanner;

public class LinkedList {

public static Node<Integer> createLinkedList(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Linked List Data : ");

		int n = sc.nextInt();
		Node<Integer> head = null;
		Node<Integer> current = null;
		while(n != -1) {
			if(head == null) {
				head = new Node<>(n);
				current = head;
			}else {
				Node<Integer> temp = new Node<>(n);
				current.next = temp;
				current = current.next;
			}
			System.out.print("Enter Next Linked List Data (-1 to Stop): ");

			n = sc.nextInt();
		}
		return head;
	}

	public static int getSize(Node<Integer> head ){
		Node<Integer> temp = head;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}

		return count;
	}

	public static void printLinkedList(Node<Integer> head) {
		
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
		System.out.println("END");
	}

}
