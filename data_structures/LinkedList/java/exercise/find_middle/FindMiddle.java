/* This is the code I submitted, 
because FindMiddleNode.java code gave the test case fail, 
even though its output is correct. I couldn't get the reason why.
*/
package LinkedList.java.exercise.find_middle;

class LinkedList implements List {

	// this is the head node or root node
	private Node root;
	private int numOfItems;
	
	@Override
	public Node getMiddleNode() {
		
		// this is where you implement the algorithm !!!
		traverse();
		System.out.println("size: " + size());
		int mid = size() / 2;
        Node midNode = root;
        for (int i = 0; i < mid; i++) {
            System.out.println("inside loop: " + i);
            midNode = midNode.getNextNode();
        }
        return midNode;
	}
	
	@Override
	public void insert(int data) {
		
		if(root==null) {
			// this is the first item in the linked list
			root = new Node(data);
		} else {
			// we know that this is not the first item in the linked list
// 			insertBeginning(data);
            insertEnd(data, root);
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
    public Node getMiddleNode();
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

public class FindMiddle {
    public static void main(String[] args) {
        
        LinkedList numbers1 = new LinkedList();

        numbers1.insert(4);
        numbers1.insert(3);
        numbers1.insert(2);
        numbers1.insert(1);

        numbers1.traverse();
        System.out.println("number of items: " + numbers1.size());
        System.out.println("mid node is: " + numbers1.getMiddleNode());

        LinkedList numbers2 = new LinkedList();

        numbers2.insert(5);
        numbers2.insert(4);
        numbers2.insert(3);
        numbers2.insert(2);
        numbers2.insert(1);

        numbers2.traverse();
        System.out.println("number of items: " + numbers2.size());
        System.out.println("mid node is: " + numbers1.getMiddleNode());
    }
}