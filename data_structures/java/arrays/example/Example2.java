import java.util.Arrays;

public class Example2 {

    // overall running time complexity is O(NlogN) + O(N) = O(NlogN), 
    // linearithmic running time complexity
    public boolean solve(char[] str1, char[] str2) {

        // length of the strings are not equal, so they cannot be anagrams.
        if (str1.length != str2.length) {
            return false;
        }

        // sort the letters of the strings
        // O(NlogN), linearithmic running time complexity
        // This complexity arises in algorithms that exhibit a
        // combination of linear and logarithmic behavior,
        // often seen in divide-and-conquer algorithms like merge sort or quicksort.
        // this is the "bottleneck" of the algorithm
        Arrays.sort(str1);
        Arrays.sort(str2);

        // consider all the letters one by one and compare these letters
        // O(N) linear running time complexity
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Example2 e2 = new Example2();
        System.out.println(e2.solve("restful".toCharArray(), "fluster".toCharArray()));
        System.out.println(e2.solve("apple".toCharArray(), "orange".toCharArray()));
    }
}
