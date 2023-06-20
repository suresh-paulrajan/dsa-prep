package main.java.leetcode.explore.arrays101;

import main.java.utils.Logger;

import java.util.HashMap;
import java.util.Map;

public class SearchForDouble {
    static Logger log = new Logger();
    public static void main(String[] args) {
//        int[] input = new int[] {10,2,5,3};
//        int[] input = new int[] {3,1,7,11};
        int[] input = new int[] {-2, 0, 10, -19, 4, 6, -8};
        log.info(checkIfExist(input));
    }

    private static boolean checkIfExist(int[] arr) {
        Map<Integer, String> store = new HashMap<>();
        for (int num : arr) {
            if(store.containsKey(num*2) || ((num % 2 == 0) && (store.containsKey(num/2)))) {
                return true;
            }
            store.put(num, "");
        }
        return false;
    }
}
