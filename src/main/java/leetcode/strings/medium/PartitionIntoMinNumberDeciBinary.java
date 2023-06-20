package main.java.leetcode.strings.medium;

import main.java.utils.Logger;

//1689
public class PartitionIntoMinNumberDeciBinary {
    static Logger log = new Logger();

    public static void main(String[] args) {
        String n = "32";
        log.info(minPartitions(n));
    }

    private static int minPartitions(String n) {
        int maxDigit = 0;
        for (char c : n.toCharArray()) {
            int tempMax = Character.getNumericValue(c);
            maxDigit = Math.max(maxDigit, tempMax);
        }
        return maxDigit;
    }
}
