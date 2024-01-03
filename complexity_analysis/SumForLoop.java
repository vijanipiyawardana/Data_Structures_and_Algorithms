public class SumForLoop {

    public static void main(String[] args) {

        // Get current timestamp in milliseconds
        long timestamp1 = System.currentTimeMillis();

        // Java program to find the sum of n natural numbers
        int number = 100;
        int total = 0;

        for (int value = 1; value <= number; value++) {
            total = total + value;
        }

        System.out.println("The sum is: " + total);

        // Get current timestamp in milliseconds after program completion
        long timestamp2 = System.currentTimeMillis();
        
        System.out.println("Execution time: " + (timestamp2 - timestamp1) + " milliseconds");
    }
    
}
