package LinkedLists;

public class LinkedList 
{
	private Node head;
	private Node tail;
	private int length;
	
    class Node //Inner Class to create a Node
	{
		int value;
		Node next;
		
		//Creating a Constructor
		Node(int value)
		{
			this.value = value;
		}

		

	}
	//Creating a Constructor which will create a Node
	public LinkedList(int value)
	{
		//Node consists of Head and Tail. 
		
		Node newNode  = new Node(value); // This will create a Node
		head = newNode;
		tail = newNode;
		length = 1; // Length is 1 because we are starting with new item
	}
	
	//Method to Print the List
	public void printList()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	//Method to get the Head
	public void getHead()
	{
		System.out.println("Head :"+head.value);
	}
	
	//Method to get the Tail
	public void getTail()
	{
		System.out.println("Tail :"+tail.value);
	}
	
	//Method to get the Length
	public void getLength()
	{
		System.out.println("Length :"+length);
	}
	
	//Method to Append
	public void append(int value)
	{
		Node newNode = new Node(value);
		if(length == 0)   //if there's no node , initially then the newly create node has Head and Tail.
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
		length++;

		
	}
	
	//Method to Remove Last(Requires 2 variables, pre and  temp)
	public Node removeLast()
	{
		Node temp = head;
		Node pre = head;
		if(length == 0)
		{
			return null;
		}
		else
		{
			pre = temp;
			temp = temp.next;
			
		}
		tail = pre;
		tail.next=null;
		length--;
		if(length ==0)
		{
			head = null;
			tail = null;
		}
		return temp;
	}
	
	//Method to the get the Index of the Linked List
	public Node getIndex(int index)
	{
		Node temp = head;
		if(index<0 || index>=length)
		{
			return null;
		}
		else
		{
			for(int i=0;i<index;i++)
			{
				temp=temp.next;
			}
		}
		return temp;
	}

}
