package main.java.leetcode.strings;

import main.java.utils.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule {
    static Logger log = new Logger();

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";
        log.info(countMatches(items, ruleKey, ruleValue));
    }

    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        int searchIndex = 0;
        if("color".equals(ruleKey))
            searchIndex = 1;
        else if("name".equals(ruleKey))
            searchIndex = 2;
        for (List<String> item : items) {
            if(item.get(searchIndex).equals(ruleValue))
                result++;
        }
        return result;
    }
}
