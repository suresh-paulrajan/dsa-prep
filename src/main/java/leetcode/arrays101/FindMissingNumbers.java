package main.java.leetcode.arrays101;

import main.java.utils.Logger;

import java.util.*;

public class FindMissingNumbers {
    static Logger log = new Logger();

    public static void main(String[] args) {
        int[] input = new int[]{4,3,2,7,8,2,3,1};
        log.info(findDisappearedNumbers(input));
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for (int num : nums)
            values.add(num);
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if(!values.contains(i))
                result.add(i);
        }
        return result;
    }
}
