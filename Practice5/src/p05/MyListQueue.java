package p05;

import p03.MyLinkedList;
import p03.MyListNode;

interface Queue{
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
}

public class MyListQueue extends MyLinkedList implements Queue{
	MyListNode front;
	MyListNode rear;
	
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()){ //ó�� �׸�
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + " added");
	}

	@Override
	public String deQueue() {
		if(isEmpty()){
			return null;
		}

		String data = front.getData();
		front = front.next;
		if( front == null ){ // ������ �׸�
			rear = null;
		}
		return data;
	}

	@Override
	public void printQueue() {
		printAll();
	}
}
