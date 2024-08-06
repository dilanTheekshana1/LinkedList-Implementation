package LinkedList;

public class SinglyLinkedLists {

	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	private Node head;

	public SinglyLinkedLists() {
	    this.head = null;
	}

	public void insert(int data) {
	    Node newNode = new Node(data);
	    if (head == null) {
	        head = newNode;
	    } else {
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	    }
	}

	public void delete(int data) {
	    if (head == null) return;

	    if (head.data == data) {
	        head = head.next;
	        return;
	    }

	    Node temp = head;
	    while (temp.next != null && temp.next.data != data) {
	        temp = temp.next;
	    }

	    if (temp.next != null) {
	        temp.next = temp.next.next;
	    }
	}

	public void traverse() {
	    Node temp = head;
	    while (temp != null) {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
	    SinglyLinkedLists list = new SinglyLinkedLists();
	    list.insert(1);
	    list.insert(2);
	    list.insert(3);
	    list.traverse();
	    list.delete(2);
	    list.traverse();
	}
}
