package com.application.stack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class StackUser {

	public static void main(String[] args) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');
LinkedList<String> list=new LinkedList<String>();
		String randonString = "'.join(['[' if i in idx else ']' for i in range(N)]";
		Stack<Character> stack = new StackImpl<Character>(randonString.length());
		System.out.println(stack.size());
		for (int i = 0; i < randonString.length(); i++) {
			if (randonString.charAt(i) == '[' || randonString.charAt(i) == '(' || randonString.charAt(i) == '{') {
				stack.push(randonString.charAt(i));
			} else if (randonString.charAt(i) == ']' || randonString.charAt(i) == ')' || randonString.charAt(i) == '}')
				if (stack.pop() != map.get(randonString.charAt(i)))
					System.out.println("string is not closed properly");
		}
		System.out.println("string is not closed properly" + !stack.isEmpty());

	}

}
