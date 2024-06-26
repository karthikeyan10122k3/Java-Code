package com.kar.practice.exercise.DataStructure.src.LinkedList;

import java.util.Scanner;

public class LinkedList {

	public static class ListNode<T> {

		public T data;
		public ListNode<T> next;

		public ListNode() {
		}

		public ListNode(T data) {
			this.data = data;
		}

	}

	public static ListNode<Integer> createLinkedList(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Linked List Data : ");

		int n = sc.nextInt();
		ListNode<Integer> head = null;
		ListNode<Integer> current = null;
		while(n != -1) {
			if(head == null) {
				head = new ListNode<>(n);
				current = head;
			}else {
				ListNode<Integer> temp = new ListNode<>(n);
				current.next = temp;
				current = current.next;
			}
			System.out.print("Enter Next Linked List Data (-1 to Stop): ");

			n = sc.nextInt();
		}
		return head;
	}

	public static int getSize(ListNode<Integer> head ){
		ListNode<Integer> temp = head;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}

		return count;
	}

	public static void printLinkedList(ListNode<Integer> head) {
		
		ListNode<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
		System.out.println("END");
	}


}
