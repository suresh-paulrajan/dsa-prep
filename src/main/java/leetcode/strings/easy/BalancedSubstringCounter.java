package main.java.leetcode.strings.easy;

import main.java.utils.Logger;

public class BalancedSubstringCounter {
    static Logger log = new Logger();

    public static void main(String[] args) {
//        String s = "RLRRLLRLRL";
        String s = "RLRRRLLRLL";
//        String s = "LLLLRRRR";
        log.info(balancedStringSplitBetter(s));
    }

    private static int balancedStringSplit(String s) {
        int result = 0;
        int lCount = 0;
        int rCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') {
                lCount++;
            } else if(s.charAt(i) == 'R') {
                rCount++;
            }
            if(lCount == rCount) {
                result++;
                lCount = 0;
                rCount = 0;
            }
        }
        return result;
    }

    private static int balancedStringSplitBetter(String s) {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') {
                counter++;
            } else {
                counter--;
            }
            if(counter == 0) {
                result++;
            }
        }
        return result;
    }
}
