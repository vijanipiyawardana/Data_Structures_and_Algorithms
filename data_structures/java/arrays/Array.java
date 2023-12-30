public class Array {

    public static void main(String[] args) {
        /**
         * compile error:
         * variable must provide either dimension expressions or an array initializer
         * arrays are not dynamic data structures
         * we have to define the size in advance
         */
        // int[] num = new int[];

        /**
         * create 1D array for 10 integers
         */
        int[] num = new int[10];

        /*
         * insert new items to given locations
         * this is when we know the index we would like to insert the given integer
         * Random indexing: we can use the indexes of the array slots
         * O(1) constant running time complexity
         */
        for (int i = 0; i < 10; ++i) {
            num[i] = i;
        }

        // print the array
        for (int i = 0; i < 10; ++i) {
            System.out.println(num[i]);
        }

        /**
         * we know the index of the item we want to manipulate
         * update a given value of an item of given index
         * if we know the index of where to use the operation,
         * the operation is extremely fast with O(1) constant running time complexity
         */
        num[0] = 100;

        /**
         * if we do not know the index of the item we are looking for (ex: search)
         * we have to check all the items in the array one by one, which is called
         * LINEAR SEARCH - which has O(N) linear running time complexity
         * ex: we want to find the index of item with value 6
         * iterate throught the item, in each iteration, check the value matches to 6
         */
        for (int i = 0; i < 10; ++i) {
            if (num[i] == 6)
                System.out.println("found the item at index " + i);
        }

    }

}
