package main.java.leetcode.arrays101;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] input = new int[] {0,1,0,3,12};
//        int[] input = new int[] {0,0,1};
        moveZeroes(input);
    }

    private static void moveZeroes(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if(num != 0) {
                nums[i] = num;
                i++;
            }
        }
        if(i == 0)
            return;
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
