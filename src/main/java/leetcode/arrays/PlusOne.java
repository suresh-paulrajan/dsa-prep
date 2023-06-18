package main.java.leetcode.arrays;

import main.java.utils.Logger;

public class PlusOne {
    static Logger log= new Logger();

    public static void main(String[] args) {
//        int[] input = new int[]{4,3,2,1};
        int[] input = new int[]{9};
//        int[] input = new int[]{4,3,2,1};
        log.error(plusOne(input));
    }

    private static int[] plusOne(int[] digits) {
        int length = digits.length;
        if(digits[length-1] != 9) {
            digits[length-1] = digits[length-1] + 1;
            return digits;
        }
        for (int i = length-1; i >= 0 ; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i]+1;
                return digits;
            }
        }

        int[] result = new int[length+1];
        result[0] = 1;
        return result;
    }
}
