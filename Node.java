 
/**
 * Generic code for nodes
 * @author Matt Rice
 * @version 09/08/2022
 * Node.java
 */
public class Node<T> {
	
	//Instance variables
	T data;//data the data stored within the node
	Node nextNode;//nexNode the pointer that points to the next node
	
	//constructor
	/**
	 * Constructor for node that instantiates both instance variables	
	 */
	public Node(){
		nextNode=null;
		data=null;
		}//end constructor
	/**
	 * a method to set the data within a node
	 * @return void
	 * @param data the data that will be set
	 */
	
	//getters and setters
	public void setData(T data) {
			this.data=data;
	}//end setData
	/**
	 * Gets the node
	 * @return the node that the user desires
	 */
	public Node getNode() {
		return this;
	}//end getNode
	/**
	 * Sets the pointer to the next node
	 * @return void
	 * @param nextNode the value of the pointer to be set
	 */
	public void setNextNode(Node nextNode){
		this.nextNode=nextNode;
	}//end nextNode
	
	
}//end Node.java
