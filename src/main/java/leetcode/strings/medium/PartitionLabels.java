package main.java.leetcode.strings.medium;

import main.java.utils.Logger;

import java.util.ArrayList;
import java.util.List;

//763
public class PartitionLabels {
    static Logger log = new Logger();

    public static void main(String[] args) {
//        String s = "ababcbacadefegdehijhklij";
        String s = "eccbbbbdec";
        log.info(partitionLabelsBetter(s));
    }

    private static List<Integer> partitionLabelsBetter(String s) {
        List<Integer> result = new ArrayList<>();
        int[] lastIndices = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndices[s.charAt(i)-'a'] = i;
        }
        int start = 0;
        int end = 0;
        for (int i = start; i < s.length(); i++) {
            end = Math.max(end, lastIndices[s.charAt(i)-'a']);
            if(i == end) {
                result.add(end-start+1);
                start = end+1;
            }
        }
        return result;
    }

    private static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int lastIndex = s.lastIndexOf(currentChar);
            if(i != lastIndex) {
                int maxIdxBeyondPartition = lastIndex;
                for (int j = i; j <= lastIndex; j++) {
                    int idxBeyondPartition = s.lastIndexOf(s.charAt(j));
                    if(idxBeyondPartition != j) {
                        maxIdxBeyondPartition = Math.max(idxBeyondPartition, maxIdxBeyondPartition);
                        lastIndex = maxIdxBeyondPartition;
                    }
                }
            }
            result.add(lastIndex+1-i);
            i = lastIndex;
        }
        return result;
    }
}
