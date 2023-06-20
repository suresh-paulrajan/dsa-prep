package main.java.leetcode.explore.arrays101;

import main.java.utils.Logger;

public class CheckIfValidMountain {
    static Logger log = new Logger();

    public static void main(String[] args) {
//        int[] input = new int[]{0,3,2,1};
//        int[] input = new int[]{3,5,5};
        int[] input = new int[]{2,1};
        log.info(validMountainArrayBetter(input));
    }

    private static boolean validMountainArray(int[] arr) {
        if(arr.length < 3)
            return false;
        int i = 0;
        int pointer = 1;
        boolean correct = false;
        for (i = 0; i < arr.length-1; i++, pointer++) {
            if(arr[i] >= arr[pointer])
                break;
            correct = true;
        }
        if(!correct)
            return false;
        correct = false;
        for (int j = i; j < arr.length && pointer < arr.length; j++, pointer++) {
            if(arr[j] <= arr[pointer])
                return false;
            correct = true;
        }
        return correct;
    }

    private static boolean validMountainArrayBetter(int[] arr) {
        if (arr.length < 3)
            return false;

        int i = 0;
        int n = arr.length;

        while (i < n - 1 && arr[i] < arr[i + 1])
            i++;

        if (i == 0 || i == n - 1)
            return false;

        while (i < n - 1 && arr[i] > arr[i + 1])
            i++;

        return i == n - 1;
    }

}
