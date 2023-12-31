/*
 * Anagram problem exercise
        Your task is to construct an algorithm to check whether two words (or phrases) 
        are anagrams or not!

        "An anagram is a word or phrase formed by rearranging the letters of a different 
        word or phrase, typically using all the original letters exactly once"

        For example: restful and fluster are anagrams.
 * 
*/
public class Exercise2 {

    public boolean solve(char[] s1, char[] s2) {

        // you get the s1 and s2 strings (char sequences) and
        // you have to return true (if they are anagram) or false otherwise
        int length = 0;
        for (int i = 0; i < s1.length; i++) {
            char c = s1[i];
            for (int j = 0; j < s2.length; j++) {
                if (c == s2[j]) {
                    length++;
                    break;
                }
            }
        }
        if (length == s1.length && length == s2.length) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        char[] s1 = new char[] { 'r', 'e', 's', 't', 'f', 'u', 'l' };
        char[] s2 = new char[] { 'f', 'l', 'u', 's', 't', 'e', 'r' };
        char[] s3 = new char[] { 'a', 'p', 'p', 'l', 'e' };
        char[] s4 = new char[] { 't', 'a', 'p', 'p', 'l', 'e' };

        // here it makes a string in string pool, other than the array in RAM (heap)
        // with variable s1 in RAM (stack)
        // char[] s1 = "restful".toCharArray();
        // char[] s2 = "fluster".toCharArray();

        Exercise2 e2 = new Exercise2();
        System.out.println(e2.solve(s1, s2));
        System.out.println(e2.solve(s3, s4));
    }
}
