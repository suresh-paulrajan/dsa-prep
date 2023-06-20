package main.java.leetcode.strings;

import main.java.utils.Logger;

public class ShuffleString {
    static Logger log = new Logger();

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = new int[]{4,5,6,7,0,2,1,3};
        log.info(restoreString(s, indices));
    }

    private static String restoreString(String s, int[] indices) {
        char[] output = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            output[indices[i]] = s.charAt(i);
        }
        return new String(output);
    }
}
