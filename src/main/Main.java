package main;

import model.ListaEnlazada;
import model.ListaEnlazadaTail;
import model.Node;

public class Main {

	public static void main(String[] args) {
		ListaEnlazadaTail list = new ListaEnlazadaTail();
		list.addFirst(new Node(5));
		list.addFirst(new Node(4));
		list.addFirst(new Node(3));
		
		
		list.addLast(new Node(10));
		list.addLast(new Node(11));
		list.addLast(new Node(12));
		
	
		list.print();
		Node nodeGoal = list.search(3);
		System.out.println("\nGoal: "+nodeGoal.getValue());
		list.delete(nodeGoal.getValue());
		list.print();
	}

}
