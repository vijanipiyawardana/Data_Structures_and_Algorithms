/**
 *  Integer reversion exercise
    Your task is to design an efficient algorithm to reverse a given integer. 
    For example if the input of the algorithm is 1234 then the output should be 4321.
    NOTE: the input is an integer (and not a string) !!!
 */
public class Example4 {

    public int reverse(int n) {
        int reversed = 0;
        int remainder = 0;

        while(n > 0) {
            remainder = n % 10;
            n = n / 10;
            reversed = reversed * 10 + remainder;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Example4 e4 = new Example4();
        System.out.println(e4.reverse(1234));
        System.out.println(e4.reverse(56789));
        System.out.println(e4.reverse(1000));
    }
    
}
