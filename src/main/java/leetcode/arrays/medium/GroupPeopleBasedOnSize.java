package main.java.leetcode.arrays.medium;

import main.java.utils.Logger;

import java.util.*;

public class GroupPeopleBasedOnSize {
    static Logger log = new Logger();

    public static void main(String[] args) {
        int[] groupSizes = new int[]{3,3,3,3,3,1,3};
        log.info(groupThePeopleBetter(groupSizes));
    }

    private static List<List<Integer>> groupThePeopleBetter(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> mapper = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            List<Integer> list = mapper.getOrDefault(size, new ArrayList<>());
            list.add(i);
            if (list.size() == size) {
                result.add(list);
                mapper.remove(size);
            } else {
                mapper.put(size, list);
            }
        }
        return result;
    }

    private static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> mapper = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> tempList;
            if(mapper.containsKey(groupSizes[i])) {
                tempList = mapper.get(groupSizes[i]);
            } else {
                tempList = new ArrayList<>();
            }
            tempList.add(i);
            mapper.put(groupSizes[i], tempList);
        }
        for (Map.Entry<Integer, List<Integer>> entry : mapper.entrySet()) {
            int size = entry.getKey();
            List<Integer> list = entry.getValue();
            if(size == list.size()) {
                result.add(list);
            } else {
                List<Integer> tempList = new ArrayList<>();
                for (Integer integer : list) {
                    tempList.add(integer);
                    if (tempList.size() == size) {
                        result.add(tempList);
                        tempList = new ArrayList<>();
                    }
                }
            }
        }
        return result;
    }
}
