package main.java.leetcode.sorting.easy;

import main.java.utils.Logger;

import java.util.Arrays;

public class MinSumOfNumbers {
    static Logger log = new Logger();

    public static void main(String[] args) {
        int num = 2932;
        log.info(minimumSum(num));
    }

    private static int minimumSum(int num) {
        int[] arr=new int[4];
        arr[0]=num%10;
        num/=10;
        arr[1]=num%10;
        num/=10;
        arr[2]=num%10;
        num/=10;
        arr[3]=num%10;
        num/=10;
        Arrays.sort(arr);

        return (arr[0]*10+arr[3])+(arr[1]*10+arr[2]);
    }
}
