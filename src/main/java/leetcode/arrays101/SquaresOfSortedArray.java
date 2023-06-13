package main.java.leetcode.arrays101;

import main.java.utils.Logger;

import java.util.Arrays;

public class SquaresOfSortedArray {
    static Logger log = new Logger();

    public static void main(String[] args) {
        int[] input = new int[] {-4, -1, 0, 3, 10};
        log.info(sortedSquaresBetter(input));
    }

    private static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(n -> n*n).sorted().toArray();
    }

    private static int[] sortedSquaresBetter(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
