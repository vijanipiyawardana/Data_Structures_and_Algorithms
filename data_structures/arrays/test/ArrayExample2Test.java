/*
 * LinkedIn course - Java: Data Structures
 *
 */
package arrays.test;

import arrays.java.ArrayExample2;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayExample2Test {

    ArrayExample2 ex2 = new ArrayExample2();

    @Test
    public void testArrayToUpperCase() {
        String[] input = new String[]{"cat", "dog", "fish"};
        ex2.arrayToUpperCase(input);
        assertArrayEquals(new String[]{"CAT", "DOG", "FISH"}, input);
    }

    @Test
    public void testIncrementArray() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        ex2.incrementArray(input);
        assertArrayEquals(new int[]{2, 3, 4, 5, 6}, input);
    }

}
