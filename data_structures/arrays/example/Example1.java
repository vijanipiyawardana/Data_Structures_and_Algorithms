/*
 * Reverse an array with while loop
*/

import java.util.Arrays;

public class Example1 {
    
    // no need of extra memory (in-place algorithm)
    // O(N/2) = O(N) linear running time complexity
    public int[] solve(int[] nums) {
        int lowIndex = 0;
        int highIndex = nums.length - 1;

        while(lowIndex < highIndex) {
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }
        return nums;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3, 4 };
        Example1 e1 = new Example1();
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(e1.solve(nums)));
        int nums2[] = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(e1.solve(nums2)));
    }
}
