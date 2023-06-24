package main.java.leetcode.sorting.easy;

import main.java.utils.Logger;

public class NumbersSmallerThanCurrentNumber {
    static Logger log = new Logger();

    public static void main(String[] args) {
        int[] nums = new int[]{8,1,2,2,3};
        log.info(smallerNumbersThanCurrentBetter(nums));
    }

    private static int[] smallerNumbersThanCurrentBetter(int[] nums) {
        int[] result = new int[nums.length];
        int[] frequency = new int[101];
        for (int num : nums)
            frequency[num]++;
        for (int i = 1; i < frequency.length; i++)
            frequency[i] += frequency[i-1];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0)
                result[i] = frequency[nums[i]-1];
        }
        return result;
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] > nums[j])
                    count++;
            }
            result[i] = count;
        }
        return result;
    }
}
