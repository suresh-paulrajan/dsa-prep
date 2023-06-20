package main.java.leetcode.strings.easy;

import main.java.utils.Logger;

import java.util.ArrayList;
import java.util.List;

public class FindCellsInExcelRange {
    static Logger log = new Logger();

    public static void main(String[] args) {
        String s = "K1:L2";
        log.info(cellsInRangeMyBetter(s));
    }

    private static List<String> cellsInRange(String s) {
        char startRow = s.charAt(0);
        int startIndex = Character.getNumericValue(s.charAt(1));
        char endRow = s.charAt(3);
        int endIndex = Character.getNumericValue(s.charAt(4));

        List<String> result = new ArrayList<>();
        StringBuilder builder;
        for (int i = startRow; i <= endRow; i++) {
            for (int j = startIndex; j <= endIndex; j++) {
                builder = new StringBuilder();
                result.add(builder.append((char) i).append(j).toString());
            }
        }
        return result;
    }

    private static List<String> cellsInRangeMyBetter(String s) {
        char startRow = s.charAt(0);
        char startIndex = s.charAt(1);
        char endRow = s.charAt(3);
        char endIndex = s.charAt(4);

        List<String> result = new ArrayList<>();
        for (char i = startRow; i <= endRow; i++) {
            for (char j = startIndex; j <= endIndex; j++) {
                result.add(new String(new char[]{i,j}));
            }
        }
        return result;
    }

    private static List<String> cellsInRangeBetter(String s) {
        List<String> result = new ArrayList<>();
        for (char i = s.charAt(0); i <= s.charAt(3); i++) {
            for (char j = s.charAt(1); j <= s.charAt(4); j++) {
                result.add(new String(new char[]{i,j}));
            }
        }
        return result;
    }
}
