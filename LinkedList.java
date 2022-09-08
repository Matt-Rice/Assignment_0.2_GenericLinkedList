/**
 * Generic class for a linked list
 * @author Matt Rice
 * @version 09/07/2022
 *LinkedList.java
 */
public class LinkedList<T> {
	//Instance variables
	private Node head;//the node at the front of the linked list
	private int length;//the amount of nodes within the linked list
	private Node tail;//the last node within the linked list
	//constructor
	/*
	 * Creates a linked list object and will initialize the variables
	 */
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end LinkedList
	/**
	 * Method to see if the linked list is empty
	 * @return true if the list is empty and false if not
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	/**
	 * Returns the head of the list(allows the user to get nodes within the list
	 * @return the head node
	 */
	public Node getList()
	{
		return head;
	}//end getList
	/**
	 * Adds a node to the list
	 * @return void
	 * @param aNode the node that will be added
	 */
	public void addNode(Node aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}//end addNode
	
	//Testing the methods within the linked list class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList=new LinkedList();//creating a linked list
		
		Node aNode=new Node();//Creating a node
		aNode.setData(1);//testing for int data
		myList.addNode(aNode);//add node to list
		aNode = new Node();//new node
		aNode.setData("Matt");//string data
		myList.addNode(aNode);//add node
		aNode=new Node();//new node
		aNode.setData(3.14);//double node
		myList.addNode(aNode);//add node
		
		//print out the data in the linked list
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
		System.out.println(myList.isEmpty());
		

	}//end main

}//end LinkedList.java

