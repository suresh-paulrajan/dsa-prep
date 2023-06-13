package main.java.leetcode.arrays101;

import main.java.utils.Logger;

public class RemoveValueInPlace {
    static Logger log = new Logger();
    public static void main(String[] args) {
//        int[] nums = new int[] {3,2,2,3};
//        int val = 3;
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;
        log.info(removeElement(nums, val));
    }

    private static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                leftShiftArray(nums, i);
                i--;
            } else if(nums[i] != -1) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }

    private static void leftShiftArray(int[] nums, int index) {
        for (int i = index; i < nums.length-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = -1;
    }
}
