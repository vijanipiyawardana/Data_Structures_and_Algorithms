package LinkedList.java.doubly_linked_list;
public class App {
    
    public static void main(String[] args) {
        
        DoublyLinkedList<String> names = new DoublyLinkedList<>();

        names.insert("Vijani");
        names.insert("Hasini");
        names.insert("Piumi");
        names.insert("Lankshani");

        names.traverseBackward();
        
        names.traverseForward();
    }
}
