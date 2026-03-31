package LinkedLists;

public class Main
{
	public static void main(String[] args)
	{
		LinkedList myLinkedList = new LinkedList(1);// This is will create Node 4
		
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		System.out.println("1st iteration");
		System.out.println("Get the index value :"+myLinkedList.getIndex(0).value);
		myLinkedList.append(2);
		myLinkedList.printList();
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		System.out.println("2nd iteration");
		System.out.println("Get the index value :"+myLinkedList.getIndex(1).value);
		myLinkedList.append(3);
		myLinkedList.printList();
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		System.out.println("3rd iteration");
		myLinkedList.removeLast();
		myLinkedList.printList();
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		
		
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		System.out.println("Get the index value :"+myLinkedList.getIndex(3).value);
	
	}
}
