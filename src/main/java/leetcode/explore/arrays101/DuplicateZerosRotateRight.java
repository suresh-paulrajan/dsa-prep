package main.java.leetcode.explore.arrays101;

import main.java.utils.Logger;

public class DuplicateZerosRotateRight {
    static Logger log = new Logger();
    public static void main(String[] args) {
        int[] input = new int[] {1,0,2,3,0,4,5,0};
//        int[] input = new int[] {1,2,3};
        duplicateZeros(input);
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                if(i+1 < arr.length) {
                    rightShiftArray(arr, i);
                    arr[i+1] = 0;
                }
                ++i;
            }
        }
    }

    private static void rightShiftArray(int[] input, int startIndex) {
        for (int i = input.length-1; i > startIndex; i--) {
            input[i] = input[i-1];
        }
    }
}
