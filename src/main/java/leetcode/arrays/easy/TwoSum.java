package main.java.leetcode.arrays.easy;

import main.java.utils.Logger;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static Logger log = new Logger();

    public static void main(String[] args) {
        int[] input = new int[]{2,7,11,15};
        log.info(twoSum(input, 9));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapper = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(mapper.containsKey(target-nums[i])) {
                return new int[] {mapper.get(target-nums[i]), i};
            } else {
                mapper.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
