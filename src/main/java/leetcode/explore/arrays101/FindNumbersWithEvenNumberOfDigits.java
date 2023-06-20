package main.java.leetcode.explore.arrays101;

import main.java.utils.Logger;

import java.util.Arrays;

public class FindNumbersWithEvenNumberOfDigits {
    static Logger log = new Logger();

    public static void main(String[] args) {
//        int[] input = new int[]{12, 345, 2, 6, 7896};
        int[] input = new int[]{555, 901, 482, 1771};
        log.info(findNumbersBetter(input));
    }

    private static int findNumbers(int[] nums) {
        int resultCounter = 0;
        for(int num : nums) {
            if(containsEvenDigits(num))
                resultCounter++;
        }
        return resultCounter;
    }

    private static int findNumbersBetter(int[] nums) {
        return (int) Arrays.stream(nums)
                .filter(FindNumbersWithEvenNumberOfDigits::containsEvenDigitsBetter)
                .count();
    }

    private static boolean containsEvenDigits(int number) {
        int digitCounter = 0;
        while (number >= 1) {
            number = number / 10;
            digitCounter++;
        }
        return (digitCounter % 2) == 0;
    }

    private static boolean containsEvenDigitsBetter(int number) {
        int digitCounter = (int) Math.log10(number) + 1;
        return (digitCounter % 2) == 0;
    }
}
