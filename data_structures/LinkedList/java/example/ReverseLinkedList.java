/*
 * Reverse a linked list in-place exercise
Construct an in-place algorithm (without the need for extra memory) to reverse a linked list!

For example: 1 -> 2 -> 3 -> 4 should be transformed into 4 -> 3 -> 2 -> 1
*/
class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;  
    private int numberOfItems;

    public void reverse() {
        // 3 pointers
        Node<T> currentNode = this.root;
        Node<T> previousNode = null;
        Node<T> nextNode = null;

        while(currentNode != null) {
            nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        this.root = previousNode;
    }

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new Node<>(data);
        } else {
            insertEnd(data, root);  
        }
    }

    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    private void insertEnd(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            insertEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (root == null)
            return;
        if (root.getData().compareTo(data) == 0) { 
            root = root.getNextNode();
        } else {
            remove(data, root, root.getNextNode());
        }
    }

    private void remove(T data, Node<T> prevNode, Node<T> actualNode) {
        while (actualNode == null) {
            if (actualNode.getData().compareTo(data) == 0) {
                numberOfItems--;
                prevNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            prevNode = actualNode;
            actualNode = actualNode.getNextNode();
        }

    }

    @Override
    public int size() {
        return numberOfItems;
    }

    @Override
    public void traverse() {
        if (root == null)
            return;
        Node<T> actualNode = root;
        while(actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }  
}

class Node<T extends Comparable<T>> {

    private T data;           
    private Node<T> nextNode; 

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return ""+ data;
    }
}


interface List<T> {
    public void reverse();
    public void insert(T data);
    public void remove(T data);
    public void traverse();
    public int size();
}

public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.insert(10);
        numbers.insert(2);
        numbers.insert(13);
        numbers.insert(5);

        numbers.traverse();

        numbers.reverse();

        numbers.traverse();
    }
    
}
