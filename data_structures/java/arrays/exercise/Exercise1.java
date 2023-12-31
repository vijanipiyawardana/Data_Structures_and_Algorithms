/*
 * Reversing an array in-place exercise
    In this exercise, you have to reverse a T[] array in O(N) linear time complexity and 
    we want the algorithm to be in-place as well - so the algorithm can not use additional 
    memory!
    For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
*/

public class Exercise1 {

    // this is the algorithm that reverses the input array (nums)
    public int[] solve(int[] nums) {

        // hint: define 2 pointers (pointing to the last and first item of the array)
        // and make a single iteration ...
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > j || i == j) 
                break;
            swap(nums, i, j);
            j--;
        }
        return nums;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    private void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = new int[] { 1, 2, 3, 4 };
        Exercise1 e1 = new Exercise1();
        e1.print(nums);
        e1.solve(nums);
        e1.print(nums);

        int nums2[] = new int[] { 1, 2, 3, 4, 5 };
        e1.print(nums2);
        e1.solve(nums2);
        e1.print(nums2);
    }
}
