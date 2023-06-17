package main.java.leetcode.arrays101;

import main.java.utils.Logger;

public class DeleteValue {
    // Same as move zeros to end
    static Logger log = new Logger();
    public static void main(String[] args) {
//        int[] input = new int[] {3,2,2,3};
        int[] input = new int[] {0,1,2,2,3,0,4,2};
        log.info(removeElement(input, 2));
    }

    private static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
