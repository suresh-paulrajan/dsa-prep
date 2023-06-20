package main.java.leetcode.explore.arrays101;


public class MergeSortedArrays {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            insertInArray(nums1, nums2[i], m, i);
        }
    }

    private static void insertInArray(int[] nums1, int value, int m, int index) {
        boolean inserted = false;
        for (int i = 0; i < (m+index); i++) {
            if(nums1[i] > value) {
                rightShiftArray(nums1, i);
                nums1[i] = value;
                inserted = true;
                break;
            }
        }
        if(!inserted) {
            rightShiftArray(nums1, m+index);
            nums1[m+index] = value;
        }
    }

    private static void rightShiftArray(int[] input, int startIndex) {
        for (int i = input.length-1; i > startIndex; i--) {
            input[i] = input[i-1];
        }
    }
}
