package main.java.leetcode.arrays.medium;

import main.java.utils.Logger;

public class CountPointsInCircle {
    static Logger log = new Logger();

    public static void main(String[] args) {
        int[][] points = new int[][] {{1,3}, {3,3}, {5,3}, {2,2}};
        int[][] queries = new int[][] {{2,3,1}, {4,3,1},{1,1,2}};
        log.info(countPoints(points, queries));
    }

    private static int[] countPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int pointsCounter = 0;
            int[] circle = queries[i];
            for (int[] point : points) {
                // Distance from circle centre to point < radius check
                double distance = (point[0]-circle[0])*(point[0]-circle[0])
                        + (point[1]-circle[1])*(point[1]-circle[1]);
                if(distance <= circle[2]*circle[2])
                    pointsCounter++;
            }

            result[i] = pointsCounter;
        }
        return result;
    }
}
