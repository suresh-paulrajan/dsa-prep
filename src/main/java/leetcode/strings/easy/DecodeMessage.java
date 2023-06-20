package main.java.leetcode.strings.easy;

import main.java.utils.Logger;

import java.util.HashMap;
import java.util.Map;

public class DecodeMessage {
    static Logger log = new Logger();

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        log.info(decodeMessage(key, message));
    }

    private static String decodeMessage(String key, String message) {
        Map<Character, Character> mapper = new HashMap<>(key.length());
        mapper.put(' ', ' ');
        char alphabet = 'a';
        for (char c : key.toCharArray()) {
            if(mapper.putIfAbsent(c, alphabet) == null)
                alphabet++;
        }
        char[] resultArray = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {
            resultArray[i] = mapper.get(message.charAt(i));
        }
        return new String(resultArray);
    }
}
