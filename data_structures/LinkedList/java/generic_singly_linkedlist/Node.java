// Linked list data structure needs to be generic: to store any object
public class Node<T extends Comparable<T>> {

    private T data;           // data store in the data structure, any data type/object
    private Node<T> nextNode; // reference to the next node

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
        // return "Node [data=" + data + "] -> ";
        return ""+ data;
    }
    
}
