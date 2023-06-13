package main.java.leetcode.arrays101;

import main.java.utils.Logger;

public class MaxConsecutiveOnes {

    static Logger log = new Logger();
    public static void main(String[] args) {
        int[] input = new int[]{1,1,0,1,1,1};
        log.info(findMaxConsecutiveOnes(input));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int currentStreak = 0;
        int maxStreak = 0;
        for (int num : nums) {
            if (num == 0) {
                currentStreak = 0;
            } else {
                currentStreak++;
            }
            maxStreak = Math.max(maxStreak, currentStreak);
        }
        return maxStreak;
    }
}
