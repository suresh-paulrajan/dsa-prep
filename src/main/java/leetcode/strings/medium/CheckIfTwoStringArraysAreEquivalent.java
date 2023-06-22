package main.java.leetcode.strings.medium;

import main.java.utils.Logger;

//1662
public class CheckIfTwoStringArraysAreEquivalent {
    static Logger log = new Logger();

    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        log.info(arrayStringsAreEqual(word1, word2));
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for (String s : word1)
            w1.append(s);
        for (String s : word2)
            w2.append(s);
        return w1.toString().equals(w2.toString());
    }
}
