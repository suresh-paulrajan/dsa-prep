package main.java.leetcode.explore.arrays101;

import main.java.utils.Logger;

import java.util.TreeSet;

public class GetThirdLargestOrLargest {

    static Logger log = new Logger();

    public static void main(String[] args) {
//        int[] input = new int[] {3,2,1};
//        int[] input = new int[] {2,1};
        int[] input = new int[] {2,2,3,1};
        log.info(thirdMax(input));
    }

    private static int thirdMax(int[] nums) {
        TreeSet<Integer> sortedSet = new TreeSet<>();
        for (int num : nums)
            sortedSet.add(num);

        if(sortedSet.size() < 3)
            return sortedSet.last();

        sortedSet.remove(sortedSet.last());
        sortedSet.remove(sortedSet.last());

        return sortedSet.last();
    }
}
