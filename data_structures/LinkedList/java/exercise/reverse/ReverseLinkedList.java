/*
 * Reverse a linked list in-place exercise
Construct an in-place algorithm (without the need for extra memory) to reverse a linked list!

For example: 1 -> 2 -> 3 -> 4 should be transformed into 4 -> 3 -> 2 -> 1
*/
package LinkedList.java.exercise.reverse;
class LinkedList implements List {

	// this is the head node or root node
	private Node root;
	private int numOfItems;
	
	@Override
	public Node reverse() {
        // complete this code
        return null;
	}
	
	@Override
	public Node get(int index) {
	    
	    int counter = 0;
	    Node node = this.root;
	    
	    while(node != null) {
	        if(index == counter)
	            return node;
	        
	        counter++;
	        node = node.getNextNode();
	    }
	    
	    return null;
	}
	
	@Override
	public void insert(int data) {
		
		if(root==null) {
			// this is the first item in the linked list
			root = new Node(data);
		} else {
			// we know that this is not the first item in the linked list
			insertBeginning(data);
		}	
        numOfItems++;
	}

	// we just have to update the references O(1)
	private void insertBeginning(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(root);
		root = newNode;
	}
	
	// because we have to start with the root node
	// first we have to find the last node in O(N)
	private void insertEnd(int data, Node node) {
		
		// this is when we keep looking for the last node O(N)
		if(node.getNextNode() != null) {
			insertEnd(data, node.getNextNode());
		} else {
			// we have found the last node
			Node newNode = new Node(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void traverse() {
		
		if(root==null) return;
		
		Node actualNode = root;
		
		while(actualNode != null) {
			System.out.println(actualNode);
			actualNode = actualNode.getNextNode();
		}	
	}

	@Override
	public int size() {
		return numOfItems;
	}
}

interface List {
    public Node get(int index);
    public Node reverse();
    public void insert(int data);
    public void traverse();
    public int size();
}

class Node {

    private int data;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "" + this.data;
    }
}
public class ReverseLinkedList {

    public static void main(String[] args) {
        
        LinkedList numbers = new LinkedList();

        numbers.insert(5);
        numbers.insert(4);
        numbers.insert(3);
        numbers.insert(2);

        numbers.traverse();

        LinkedList reversed = new LinkedList();
        Node node = numbers.reverse();
        while(node != null) {
            reversed.insert(node.getData());
        }

        reversed.traverse();
    }
    
}
