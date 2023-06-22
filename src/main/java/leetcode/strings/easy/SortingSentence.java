package main.java.leetcode.strings.easy;

import main.java.utils.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortingSentence {
    static Logger log = new Logger();

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
//        String s = "Myself2 Me1 I4 and3";
        log.info(sortSentence(s));
    }

    private static String sortSentence(String s) {
        String[] arr = s.split(" ");
        Map<Integer, String> mapper = new HashMap<>();
        for(String word : arr) {
            int len = word.length();
            mapper.put(word.charAt(len-1)-'0', word.substring(0, len-1));
        }
        StringBuilder result = new StringBuilder();
        for (Entry<Integer, String> entry : mapper.entrySet()) {
            result.append(entry.getValue()).append(" ");
        }
        return result.substring(0, result.length()-1);
    }
}
