package main.java.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        generate(5);
    }
    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <=numRows; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if(j == 1 || j == i){
                    innerList.add(1);
                } else {
                    List<Integer> previousRow = result.get(result.size()-1);
                    innerList.add(previousRow.get(j-2)+previousRow.get(j-1));
                }
            }
            result.add(innerList);
        }
        return result;
    }
}
