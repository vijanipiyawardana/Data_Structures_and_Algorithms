public class App {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.insert("Vijani");
        names.insert("Sasini");
        names.insert("Piumi");

        names.traverse();

        names.remove("Vijani");

        names.traverse();

        names.remove("Lakshani"); // nothing happens as it's not in the linked list

        names.traverse();
    }
}
