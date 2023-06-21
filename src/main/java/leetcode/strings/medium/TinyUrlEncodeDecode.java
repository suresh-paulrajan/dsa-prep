package main.java.leetcode.strings.medium;

import main.java.utils.Logger;

import java.util.HashMap;
import java.util.Map;

public class TinyUrlEncodeDecode {
    static Logger log = new Logger();

    static Map<String , String> urlMapper = new HashMap<>();

    static Map<String, String> codeDB = new HashMap<>();
    static Map<String, String> urlDB = new HashMap<>();
    static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        String url = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = encode(url);
        String longUrl = decode(shortUrl);
        log.info("shortUrl :: "+shortUrl+" :: longUrl :: "+longUrl);
    }

    private static String encode(String longUrl) {
        urlMapper.put("a", longUrl);
        return "a";
    }

    // Decodes a shortened URL to its original URL.
    private static String decode(String shortUrl) {
        return urlMapper.get(shortUrl);
    }

    private static String getCode() {
        char[] code = new char[6];
        for (int i = 0; i < 6; i++)
            code[i] = chars.charAt((int)Math.random() * 62);
        return "http://tinyurl.com/" + String.valueOf(code);
    }

    private static String encodeCorrect(String longUrl) {
        if (urlDB.containsKey(longUrl)) return urlDB.get(longUrl);
        String code = getCode();
        while (codeDB.containsKey(code)) code = getCode();
        codeDB.put(code, longUrl);
        urlDB.put(longUrl, code);
        return code;
    }

    private static String decodeCorrect(String shortUrl) {
        return codeDB.get(shortUrl);
    }
}
