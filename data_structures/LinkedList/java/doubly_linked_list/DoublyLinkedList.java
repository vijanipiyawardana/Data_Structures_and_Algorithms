package LinkedList.java.doubly_linked_list;
public class DoublyLinkedList<T extends Comparable<T>> {

    private Node<T> head;
    private Node<T> tail;

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        // this is the first item in the linked list
        if (tail == null) {
            // both of the pointers are pointed to the new node
            tail = newNode;
            head = newNode;
        } else {
            // we have to insert the new item to the end of the list
            // we just have to manipulate the tail node and its references in O(1)
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    // let's traverse the list forward (from left to right)
    public void traverseForward() {
        Node<T> actualNode = head;
        while(actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

      // let's traverse the list backward (from right to left)
      public void traverseBackward() {
        Node<T> actualNode = tail;
        while(actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getPreviousNode();
        }
    }
    
}
