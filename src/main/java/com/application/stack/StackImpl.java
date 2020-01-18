package com.application.stack;

public class StackImpl<E> implements Stack<E> {
	transient Object[] elementData;
	private int top = -1;

	public StackImpl(int size) {
		this.elementData = new Object[size];
	}

	public boolean push(E element) {
		top++;
		elementData[top] = element;
		return true;
	}

	public E pop() {
		if (isEmpty())
			throw new UnderFlowException();
		E element = (E) elementData[top];
		elementData[top] = null;
		top--;
		return element;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public E peek() {
		if (isEmpty())
			throw new UnderFlowException();
		return (E) elementData[top];
	}

	public int size() {
		return elementData.length;
	}

	public boolean isFull() {
		return top == elementData.length - 1;
	}

}
