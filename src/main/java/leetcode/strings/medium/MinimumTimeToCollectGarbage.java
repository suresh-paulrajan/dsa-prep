package main.java.leetcode.strings.medium;

import main.java.utils.Logger;

//2391
public class MinimumTimeToCollectGarbage {
    static Logger log = new Logger();

    public static void main(String[] args) {
        String[] garbage = new String[] {"G","P","GP","GG"};
        int[] travel = new int[] {2,4,3};
//        String[] garbage = new String[] {"MMM","PGM","GP"};
//        int[] travel = new int[] {3,10};
        log.info(garbageCollectionBetter(garbage, travel));
    }

    private static int garbageCollectionBetter(String[] garbage, int[] travel) {
        int result = 0;
        int pLastIndex = 0;
        int gLastIndex = 0;
        int mLastIndex = 0;
        int[] travelCost = new int[travel.length+1];
        for (int i = 1; i < travelCost.length; i++) {
            travelCost[i] = travelCost[i-1] + travel[i-1];
        }

        for (int i = garbage.length-1; i >= 0; i--) {
            if(garbage[i].contains("P")) {
                pLastIndex = i;
                break;
            }
        }
        for (int i = garbage.length-1; i >= 0; i--) {
            if(garbage[i].contains("G")) {
                gLastIndex = i;
                break;
            }
        }
        for (int i = garbage.length-1; i >= 0; i--) {
            if(garbage[i].contains("M")) {
                mLastIndex = i;
                break;
            }
        }

        for (String garb : garbage)
            result += garb.length();

        result += travelCost[pLastIndex];
        result += travelCost[gLastIndex];
        result += travelCost[mLastIndex];

        return result;
    }

    // Working - but beats only 25%
    private static int garbageCollection(String[] garbage, int[] travel) {
        int paperCount = getEachTruckCount('P', garbage, travel);
        int glassCount = getEachTruckCount('G', garbage, travel);
        int metalCount = getEachTruckCount('M', garbage, travel);

        return metalCount+paperCount+glassCount;
    }

    private static int getEachTruckCount(char truckType, String[] garbage, int[] travel) {
        int time = 0;
        int count = 0;
        int trashFoundIndex = -1;
        for (int i = 0; i < garbage.length; i++) {
            for (char c : garbage[i].toCharArray()) {
                if(c == truckType)
                    count++;
            }
            if(count > 0) {
                trashFoundIndex = i;
                time += count;
            }
            count = 0;
        }
        if(trashFoundIndex > -1) {
            for (int i = 0; i < trashFoundIndex; i++) {
                time += travel[i];
            }
        }
        return time;
    }
}
