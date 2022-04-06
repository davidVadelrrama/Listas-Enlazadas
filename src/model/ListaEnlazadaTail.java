package model;

public class ListaEnlazadaTail {
	
	private Node head;
	private Node tail;
	
	public void addFirst(Node n) {
		if(head == null) {
			head = n;
			tail = n;
		}else {
			n.setNext(head);
			head = n;
		}
	}
	
	public void addLast(Node n) {
		if(tail == null) {
			head = n;
			tail = n;
		}else {
			tail.setNext(n);
			tail = n;
		}
	}
	
	public Node search(int goal) {
		return search(head, goal);
	}
	
	
	private Node search(Node current, int goal) {
	
		//Caso Base
		if(current == null) {
			return null;
		}
		if(current.getValue()==goal) {	
			return current;
		}
		
		//Llamado recursivo
		return search(current.getNext(), goal);
		
		
	}
	
	public void print() {
		print(head);
	}
	
	private void print(Node current) {
		if(current == null) {
			return;
		}
		System.out.print(current.getValue()+"->");
		print(current.getNext());
	}
	
	public void delete(int value) {
		delete(null, head, value);
	}
	
	private void delete(Node prev, Node current, int value) {
		
		if(current == null) {
			return;
		}
		if(head.getValue() == value) {
			 head = head.getNext();
			 return;
		}
		if(current.getValue() == value) {
			prev.setNext(current.getNext());
			return;
		}
		delete(current, current.getNext(), value);
	}
	
	
	

}
