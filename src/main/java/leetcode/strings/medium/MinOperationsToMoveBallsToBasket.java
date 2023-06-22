package main.java.leetcode.strings.medium;

import main.java.utils.Logger;

import java.util.HashSet;
import java.util.Set;

//1769
public class MinOperationsToMoveBallsToBasket {
    static Logger log = new Logger();

    public static void main(String[] args) {
//        String input = "110";
        String input = "001011";
        log.info(minOperationsBest(input));
    }

    private static int[] minOperationsBest(String boxes) {
        int len = boxes.length();
        int count=0;
        int distance=0;
        int[] left=new int[len];
        int[] right=new int[len];
        for(int i=0;i<len;i++){
            distance=distance+count;
            left[i]=distance;
            count+= boxes.charAt(i)-'0';
        }
        distance=count=0;
        for(int i=len-1;i>=0;i--){
            distance=distance+count;
            right[i]=distance;
            count+= boxes.charAt(i)-'0';
        }
        for(int i=0;i<len;i++){
            left[i]=left[i]+right[i];
        }
        return left;
    }

    // Working Solution - but too slow and bad memory usage
    private static int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            int opsCount = 0;
            int cursor = i;
            int nextIndex = boxes.indexOf('1', cursor+1);
            Set<Integer> skipIndices = new HashSet<>();
            while (nextIndex != -1) {
                if(!skipIndices.contains(nextIndex)) {
                    opsCount += nextIndex-i;
                    skipIndices.add(nextIndex);
                    cursor = nextIndex;
                } else
                    cursor++;
                nextIndex = boxes.indexOf('1', cursor+1);
            }

            cursor = i;
            int prevIndex = boxes.lastIndexOf('1', cursor-1);
            while (prevIndex != -1) {
                if(!skipIndices.contains(prevIndex)) {
                    opsCount += i-prevIndex;
                    skipIndices.add(prevIndex);
                    cursor = prevIndex;
                } else
                    cursor--;
                prevIndex = boxes.lastIndexOf('1', cursor-1);
            }
            result[i] = opsCount;
        }
        return result;
    }
}
