package main.java.leetcode.explore.arrays101;

import main.java.utils.Logger;

public class ReplaceWithLargestElementInRight {
    static Logger log = new Logger();
    public static void main(String[] args) {
        int[] input = new int[] {17,18,5,4,6,1};
        log.info(replaceElements(input));
    }

    private static int[] replaceElements(int[] arr) {
        int length = arr.length;
        int max = arr[length-1]; // Last element
        arr[length-1] = -1;

        for (int i = length-2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if(temp > max)
                max = temp;
        }
        return arr;
    }
}
