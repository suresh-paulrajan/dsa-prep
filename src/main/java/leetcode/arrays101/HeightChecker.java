package main.java.leetcode.arrays101;

import main.java.utils.Logger;

import java.util.Arrays;

public class HeightChecker {
    static Logger log = new Logger();
    public static void main(String[] args) {
//        int[] heights = new int[]{1,1,4,2,1,3};
        int[] heights = new int[]{5,1,2,3,4};
        log.info(heightChecker(heights));
    }

    private static int heightChecker(int[] heights) {
        int[] expected = Arrays.stream(heights).sorted().toArray();
        int misMatchCount = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != expected[i])
                misMatchCount++;
        }
        return misMatchCount;
    }
}
