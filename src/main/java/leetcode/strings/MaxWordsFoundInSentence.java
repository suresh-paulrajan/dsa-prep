package main.java.leetcode.strings;

import main.java.utils.Logger;

import java.util.StringTokenizer;

public class MaxWordsFoundInSentence {
    static Logger log = new Logger();

    public static void main(String[] args) {
        String[] input = new String[]{"alice and bob love leetcode",
                "i think so too", "this is great thanks very much"};
        log.info(mostWordsFound(input));
    }

    private static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            maxWords = Math.max(maxWords, sentence.split(" ").length);
        }
        return maxWords;
    }

    private static int mostWordsFoundFaster(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            maxWords = Math.max(maxWords, new StringTokenizer(sentence).countTokens());
        }
        return maxWords;
    }
}
