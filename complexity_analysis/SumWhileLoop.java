public class SumWhileLoop {
    public static void main(String[] args) {
        // Get current timestamp in milliseconds
        long timestamp1 = System.currentTimeMillis();

        // Sum of natural numbers up to num
        int num = 100;

        if (num < 0) {
            System.out.println("Enter a positive number.");
        } else {
            int sum = 0;
            
            // Use a while loop to iterate until 0
            while (num > 0) {
                sum += num;
                num--;
            }

            System.out.println("The sum is: " + sum);
        }

        // Get current timestamp in milliseconds after program completion
        long timestamp2 = System.currentTimeMillis();
        System.out.println("Execution time: " + (timestamp2 - timestamp1) + " milliseconds");
    }
}
