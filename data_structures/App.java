import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();

        long now = System.currentTimeMillis();

        // insert halt-a-million items into the front
        // manipulating first item index 0 make all other elements to shift
        for (int i = 0; i < 500000; ++i) {
            array1.add(0, i);
        }

        System.out.println("Time taken for ArrayList adding to front: " + (System.currentTimeMillis() - now));
        // Time taken for ArrayList adding to front: 37290

        // ==============================================================================
        ArrayList<Integer> array2 = new ArrayList<>();

        now = System.currentTimeMillis();

        // insert halt-a-million items into the end
        // no shifting items
        for (int i = 0; i < 500000; ++i) {
            array2.add(i);
        }

        System.out.println("Time taken for ArrayList adding to end: " + (System.currentTimeMillis() - now));
        // Time taken for ArrayList adding to end: 69

        // ==============================================================================
        LinkedList<Integer> list = new LinkedList<>();

        now = System.currentTimeMillis();

        // insert halt-a-million items into the front
        // no shifting items
        for (int i = 0; i < 500000; ++i) {
            list.addFirst(i);
        }

        System.out.println("Time taken for LinkedList adding to front: " + (System.currentTimeMillis() - now));
        // Time taken for LinkedList adding to front: 155
        
    }
}
