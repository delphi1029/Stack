package com.ds.stack;

public class StackMain {

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(new StackNode(1));
		s.push(new StackNode(2));
		s.push(new StackNode(3));
		s.push(new StackNode(4));
		s.push(new StackNode(5));
		s.push(new StackNode(6));
		s.push(new StackNode(7));
		s.push(new StackNode(8));
		s.push(new StackNode(9));
		s.push(new StackNode(10));
		s.push(new StackNode(11));
		
		s.print();
		
		s.pop();
		s.pop();
		s.pop();
		System.out.println();
		
		System.out.println("***********************************");
		
		s.print();
		

	}

}
