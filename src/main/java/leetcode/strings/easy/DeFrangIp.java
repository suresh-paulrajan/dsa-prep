package main.java.leetcode.strings.easy;

import main.java.utils.Logger;

public class DeFrangIp {
    static Logger log = new Logger();
    public static void main(String[] args) {
        String input = "1.1.1.1";
        log.info(defangIPaddr(input));
    }
    private static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
