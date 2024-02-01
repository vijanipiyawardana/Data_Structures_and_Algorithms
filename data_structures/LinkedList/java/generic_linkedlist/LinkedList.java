public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;   // this is the head node or root node
    private int numberOfItems;


    @Override
    public void insert(T data) {
        if (root == null) {
            // this is the first item in the linked list
            root = new Node<>(data);
        } else {
            // we know this is not the first item in the linked list
            // insertBeginning(data); // When traverse: Piumi, Sasini, Vijani
            insertEnd(data, root);    // When traverse: Vijani, Sasini, Piumi
        }
    }

    // update the references: O(1) runtime complexity
    private void insertBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

     // because we have to start with the root node, 
     // first we have to find the last node in O(n) linear runtime complexity
     private void insertEnd(T data, Node<T> node) {
        // this is when we are looking for the last node: O(n)
        if (node.getNextNode() != null) {
            // recursively call the same method
            insertEnd(data, node.getNextNode());
        } else {
            // we have found the last node, so update the references
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (root == null)
            return;
        
        // we have to remove the first node, 
        // check the data we want to remove is equal to the data in root node
        // since we extend from Comparable class, we can use compareTo() method
        // if compareTo() method returns 0, that means the data is equal
        // > 0 root node data is greater than data, < 0 root node data is less than data
        if (root.getData().compareTo(data) == 0) { 
            root = root.getNextNode(); // get rid of root node
        } else {
            // to remove an internal node
            remove(data, root, root.getNextNode());
        }
    }

    private void remove(T data, Node<T> prevNode, Node<T> actualNode) {
        // we have to find the node we have to remove
        while (actualNode == null) {
            // this is the node we want to remove
            if (actualNode.getData().compareTo(data) == 0) {
                // update the references
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
        // chck if the root node is null, so the linked list is empty
        if (root == null)
            return;

        Node<T> actualNode = root;

        while(actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

    
    
}
