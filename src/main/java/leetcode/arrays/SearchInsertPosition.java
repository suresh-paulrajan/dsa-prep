package main.java.leetcode.arrays;

import main.java.utils.Logger;

public class SearchInsertPosition {
    static Logger log = new Logger();
    public static void main(String[] args) {
        int[] input = new int[] {1,3,5,6};
//        int[] input = new int[] {1,3,5};
        log.info(searchInsert(input, 5));
//        log.info(searchInsert(input, 4));
//        log.info(searchInsert(input, 7));
    }
    private static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if(target < nums[0])
            return 0;
        else if (target > nums[length-1])
            return length;
        for (int i = 0, j = nums.length-1; i < length; i++, j--) {
            if(nums[i] == target || nums[i] > target)
                return i;
            else if (nums[j] == target)
                return j;
            else if (nums[j] < target)
                return j+1;
        }
        return 0;
    }
}
