package com.application.stack;

public interface Stack<E> {

	boolean push(E element);

	E pop();
	
	boolean isEmpty();
	
	E peek();
	
	
	int size();


}
