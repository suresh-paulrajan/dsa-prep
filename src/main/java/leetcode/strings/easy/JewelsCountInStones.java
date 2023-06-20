package main.java.leetcode.strings.easy;

import main.java.utils.Logger;

import java.util.HashMap;
import java.util.Map;

public class JewelsCountInStones {
    static Logger log = new Logger();
    public static void main(String[] args) {
//        String jewels = "aA";
        String jewels = "z";
//        String stones = "aAAbbbb";
        String stones = "ZZ";
        log.info(numJewelsInStonesBetter(jewels, stones));
    }
    private static int numJewelsInStones(String jewels, String stones) {
        Map<Character, String> mapper = new HashMap<>();
        for (Character jewel : jewels.toCharArray())
            mapper.put(jewel, "");
        int result = 0;
        for (Character stone : stones.toCharArray())
            if(mapper.containsKey(stone))
                result++;
        return result;
    }
    private static int numJewelsInStonesBetter(String jewels, String stones) {
//        Map<Character, String> mapper = new HashMap<>();
//        for (Character jewel : jewels.toCharArray())
//            mapper.put(jewel, "");
        int result = 0;
        for (Character stone : stones.toCharArray())
            if(jewels.indexOf(stone) != -1)
                result++;
        return result;
    }

}
