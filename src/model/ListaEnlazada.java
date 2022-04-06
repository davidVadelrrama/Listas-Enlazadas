package model;

public class ListaEnlazada {

	private Node head;

	public void addFirst(Node n) {
		// lista vacia
		if (head == null) {
			head = n;

			// Lista NO vacia
		} else {
			n.setNext(head);
			head = n;
		}
	}

	public void addLast(Node n) {
		addLast(head, n);
	}

	private void addLast(Node current, Node n) {

		// Caso Base
		if (current == null) {
			current = n;
			return;
		}

		if (current.getNext() == null) {
			current.setNext(n);
			return;
		}

		// Recursivo
		addLast(current.getNext(), n);

	}

	public void addLastIterative(Node n) {
		if (head == null) {
			head = n;
		} else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(n);

		}
	}

	private void print(Node current) {
		// Caso Base
		if (current == null) {
			return;
		}

		// Iterativo
		System.out.print(current.getValue()+"->");
		print(current.getNext());
	}

	public void print() {
		print(head);
	}

}
