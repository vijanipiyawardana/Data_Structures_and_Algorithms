class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;  
    private int numberOfItems;

    public Node<T> getMiddleNode() {
        // 2 pointers
        Node<T> slow = this.root;
        Node<T> fast = this.root;

        // running time complexity O(n/2) = O(n) linear running time complexity
        while(fast.getNextNode() != null && fast.getNextNode().getNextNode() != null) {
            slow = slow.getNextNode();
            fast = fast.getNextNode().getNextNode(); // twice
        }

        return slow;
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
    public void insert(T data);
    public void remove(T data);
    public void traverse();
    public int size();
}

public class FindMiddleNode {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.insert("Vijani");
        names.insert("Sasini");
        names.insert("Piumi");
        // names.insert("Ganga");

        System.out.println(names.getMiddleNode());
    }
}
