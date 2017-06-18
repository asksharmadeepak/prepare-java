package com.prepare.collections;

public class LinkedList {

	Node headNode = null;
	Node tempNode;

	public void add(int data) {
		Node newNode = new Node(data);
		if (headNode == null) {
			headNode = newNode;
		}
		tempNode=headNode;
		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();

		}
		newNode=tempNode.next;
	}
	
	public void show(){
	    Node tempNode=headNode;
		while(tempNode.getNext()!=null){
			System.out.println(tempNode.getData());
			tempNode=tempNode.getNext();
		}
	}

}
