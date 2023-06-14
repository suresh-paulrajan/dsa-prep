package main.java.leetcode.arrays101;

import main.java.utils.Logger;

public class RemoveDuplicatesInPlace {
    static Logger log = new Logger();
    public static void main(String[] args) {
        int[] input = new int[] {1,2,3,4,5};
        log.info(removeDuplicatesBetter(input));
    }

    public static int removeDuplicates(int[] nums) {
        int dupsCount = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < -100)
                break;
            if(nums[i] == nums[i-1]) {
                leftShift(nums, i);
                dupsCount++;
                i--;
            }
        }
        return nums.length-dupsCount;
    }

    public static int removeDuplicatesBetter(int[] nums) {
        if(nums.length <= 1)
            return nums.length;

        int pointer = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[pointer-1]) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }

        return pointer;
    }

    private static void leftShift(int[] nums, int startIndex) {
        for (int i = startIndex; i < nums.length-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = -101;
    }
}
