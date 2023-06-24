package main.java.leetcode.strings.medium;

import main.java.utils.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LaserBeamsInBank {
    static Logger log = new Logger();

    public static void main(String[] args) {
        String[] bank = new String[] {"011001","000000","010100","001000"};
//        String[] bank = new String[] {"000","111","000"};
        log.info(numberOfBeamsBetter(bank));
    }

    private static int numberOfBeamsBetter(String[] bank) {
        int result = 0;
        int count;
        int prev = 0;
        for (String s : bank) {
            count = 0;
            for (char c : s.toCharArray())
                count += c-'0';
            if (count == 0)
                continue;
            result += prev * count;
            prev = count;
        }
        return result;
    }

    private static int numberOfBeams(String[] bank) {
        int laserCounter = 0;
        for (int i = 0; i < bank.length-1; i++) {
            if(bank[i].contains("1")) {
                long iCount = bank[i].chars().filter(c -> c == '1').count();
                boolean nextRowFound = false;
                for (int j = i+1; j < bank.length; j++) {
                    if(bank[j].contains("1")) {
                        laserCounter += iCount * bank[j].chars().filter(c -> c == '1').count();
                        nextRowFound = true;
                    }
                    if(nextRowFound)
                        break;
                }
            }
        }
        return laserCounter;
    }
}
