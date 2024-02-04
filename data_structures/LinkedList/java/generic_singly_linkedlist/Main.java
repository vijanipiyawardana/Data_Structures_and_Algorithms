package LinkedList.java.generic_singly_linkedlist;

public class Main {
    
    public static void main(String[] args) {
        
        LinkedList<Person> people = new LinkedList<>();

        Person p = new Person(20, "Hasini");
        people.insert(p);

        people.insert(new Person(23, "Vijani"));
        people.insert(new Person(24, "Sasini"));
        people.insert(new Person(22, "Piumi"));

        people.traverse();

        people.remove(p);   // removes the root

        people.traverse();

    }
}
