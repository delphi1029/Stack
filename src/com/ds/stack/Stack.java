package com.ds.stack;

public class Stack {

	private StackNode head;
	
	private int numberOfNodes;
	
	
	public void push(StackNode node) {
		node.next = head;
		head = node;
		numberOfNodes++;
	}
	
	
	public StackNode pop() {
		StackNode temp = head;
		head = head.next;
		temp.next = null;
		numberOfNodes--;
		return temp;
	}
	
	public int size() {
		return numberOfNodes;
	}
	
	public void print() {
		StackNode temp = head;
		
		while(temp != null) {
			System.out.print(temp.val+" -> ");
			temp = temp.next;
		}
	}
	
}
