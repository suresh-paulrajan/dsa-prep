package main.java.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwo {
    public static void main(String[] args) {
        getRow(3);
    }
    private static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        for (int i = 1; i <=rowIndex+1; i++) {
            innerList = new ArrayList<>();
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
        return innerList;
    }
}
