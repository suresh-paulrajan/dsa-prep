package main.java.leetcode.arrays.medium;

import main.java.utils.Logger;

public class SubrectangleQueries {
    static Logger log = new Logger();

    int[][] rectangle;

    public static void main(String[] args) {
        int[][] rectangle = new int[][] {{1,2,1}, {4,3,4}, {3,2,1}, {1,1,1}};
        SubrectangleQueries obj = new SubrectangleQueries(rectangle);
        log.info(obj.getValue(0,2));
        obj.updateSubrectangle(0,0,3,2,5);
        log.info(obj.getValue(0,2));
        log.info(obj.getValue(3,1));
        obj.updateSubrectangle(3,0,3,2,10);
        log.info(obj.getValue(3,1));
        log.info(obj.getValue(0,2));
    }

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2 ; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}
