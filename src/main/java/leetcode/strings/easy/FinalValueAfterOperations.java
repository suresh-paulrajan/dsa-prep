package main.java.leetcode.strings.easy;

import main.java.utils.Logger;

public class FinalValueAfterOperations {
    static Logger log = new Logger();

    public static void main(String[] args) {
        String[] input = new String[]{"--X","X++","X++"};
        log.info(finalValueAfterOperations(input));
    }

    private static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String op : operations)
            if(op.charAt(1) == '+')
                result++;
            else
                result--;
        return result;
    }
}
