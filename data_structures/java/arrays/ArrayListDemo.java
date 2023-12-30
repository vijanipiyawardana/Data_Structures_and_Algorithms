import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        /**
         * ArrayLists use standard Arrays under the hood
         * List is an interface and ArrayList is the implementation
         * Default capacity of an ArrayList is 10, which means
         * Java is going to make 1D array of 10 items
         * If we are going to insert more than 10 items,
         * Java is going to resize the 1D array automatically.
         * Usually, the size of the array is doubled and
         * all the items are copied to the new array from the old array one by one.
         */
        List<String> names = new ArrayList<>();

        /**
         * Resizing an array is expensive as it takes O(N) linear runtime complaxity.
         * Let's take a look at how it works here:
         */
        // inserting items
        names.add("Vijani"); // the fist item with index 0
        names.add("Indunil");
        names.add("Nimal");
        names.add("Chandra");

        // get the size of the data structure
        System.out.println("size of data structure: " + names.size());

        // getting items
        // random access: if we know the index of the item O(1) running time complexity
        System.out.println(names.get(0));

        // remove items
        // Java will remove the item and shift all other items to remove the gap
        // O(N) linear running time complexity, unless we manipulate the last item
        // removing the last item is quite easy/fast, because we don't have to shift items
        // but manipulating the first item is expensive with O(N)
        // System.out.println(names.remove(0)); // remove item with index 0, and returns
        // the removed item of the data structure
        // System.out.println(names.get(0));
        names.remove(0);
        System.out.println(names.get(0));

        // iterate through items
        for (String name : names) {
            System.out.println(name);
        }

    }

}
