package model;

public class Node {

	//Información
	private int value;
	
	
	//Enlaces
	private Node next;
	
	//Constructor
	public Node(int value) {
		this.value=value;
	}

	//Getters & Setters
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
