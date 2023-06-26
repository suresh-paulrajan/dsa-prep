package main.java.tuf.arrays;

import main.java.utils.Logger;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDupsInPlace {
    static Logger log = new Logger();

    public static void main(String[] args) {
        int[] input = new int[] {1,1,2,2,3,3};
        log.info(removeDupsWithoutSet(input));
    }

    private static int[] removeDups(int[] input) {
        Set<Integer> set = new TreeSet<>();
        for (int num : input)
            set.add(num);
        int i=0;
        for (int num : set) {
            input[i] = num;
            i++;
        }
        return input;
    }

    private static int[] removeDupsWithoutSet(int[] input) {
        int i=0;
        for (int j = 1; j < input.length; j++) {
            if(input[j] != input[i]) {
               input[i+1] = input[j];
               i++;
            }
        }
        return input;
    }
}
