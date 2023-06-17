package main.java.leetcode.arrays101;

import main.java.utils.Logger;

// Even numbers first, then all odd numbers
public class SortByParity {
    static Logger log = new Logger();
    public static void main(String[] args) {
        int[] input = new int[] {3,1,2,4};
        log.info(sortArrayByParity(input));
    }

    private static int[] sortArrayByParity(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                int temp = nums[even];
                nums[even] = nums[i];
                nums[i] = temp;
                even++;
            }
        }
        return nums;
    }
}
