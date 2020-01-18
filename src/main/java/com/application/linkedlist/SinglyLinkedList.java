package com.application.linkedlist;

public class SinglyLinkedList<T> {
	Node head;

	public void add(SinglyLinkedList list, T obj) {
		Node<T> node = new Node<T>(obj);
		if (list.head == null) {
			list.head = node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}
	}

	public void printList() {
		if (this.head == null) {
			System.out.println("list is empty");
		} else {
			Node last = this.head;

			while (last.next != null) {
				System.out.println(last.data);
				last = last.next;
			}
			System.out.println(last.data);

		}
	}

	@SuppressWarnings("unchecked")
	public boolean deleteByKey(Object value) {
		Node current = this.head;
		Node pre = null;
		if (current != null && current.data.equals(value)) {
			this.head = current.next;
			return true;
		}

		while (current != null && !current.data.equals(value)) {
			pre = current;
			current = current.next;
		}
		if (current != null && current.data.equals(value)) {
			pre.next = current.next;
			return true;
		}

		if (current == null) {
			return false;
		}
		return false;
	}

	public boolean search(Object value) {
		if (this.head == null) {
			return false;
		} else {
			Node last = this.head;
			while (last.next != null) {
				if (last.data == value)
					return true;
				last = last.next;
			}
			if (last.data == value) {
				return true;
			}

			return false;
		}
	}

	static class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}

	}

}
