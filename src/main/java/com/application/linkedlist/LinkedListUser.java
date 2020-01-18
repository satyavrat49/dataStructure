package com.application.linkedlist;

public class LinkedListUser {

	public static void main(String[] args) {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.add(list, "test");
		list.add(list, "if ");
		list.add(list, "it");
		list.add(list, "working");
		list.printList();
		System.out.println(list.search("working"));
		System.out.println("---------------------");
		list.deleteByKey("test");
		list.printList();
		System.out.println("---------------------");
	System.out.println(list.deleteByKey("it"));	
		list.printList();
		System.out.println("---------------------");
		list.deleteByKey("working");
		list.printList();

	}

}
