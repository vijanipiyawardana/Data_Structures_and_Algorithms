/*
 *  Palindrome problem exercise
    "A palindrome is a string that reads the same forward and backward"
    For example: radar or madam
    Your task is to design an optimal algorithm for checking whether a 
    given string is palindrome or not! 
*/
public class Exercise3 {

    public boolean solve(String s) {
			
		// define 2 pointers (forward pointer and backward pointer and compare characters accordingly)
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
	}

    public static void main(String[] args) {

        Exercise3 e3 = new Exercise3();
        System.out.println(e3.solve("radar"));
        System.out.println(e3.solve("rader"));
        System.out.println(e3.solve("radam"));
        System.out.println(e3.solve("madar"));
        System.out.println(e3.solve("acca"));

    }
}
