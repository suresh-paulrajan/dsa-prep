package main.java.leetcode.strings.medium;

import main.java.utils.Logger;

//2120
public class RobotGridInstructions {
    static Logger log = new Logger();

    public static void main(String[] args) {
//        int n = 3;
//        int[] startPos = new int[]{0,1};
//        String s = "RRDDLU";
        int n = 2;
        int[] startPos = new int[]{1,1};
        String s = "LURD";
        log.info(executeInstructions(n, startPos, s));
    }

    private static int[] executeInstructions(int n, int[] startPos, String s) {
        int[] result = new int[s.length()];
        int moves;
        int cursor;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int x = startPos[0];
            int y = startPos[1];
            moves = 0;
            cursor = i;
            boolean isInvalidMove = false;
            while (cursor < len && !isInvalidMove) {
                switch (s.charAt(cursor)) {
                    case 'L':
                        if(y-1 >= 0) {
                            moves++;
                            y--;
                        } else {
                            isInvalidMove = true;
                        }
                        break;
                    case 'R':
                        if(y+1 < n) {
                            moves++;
                            y++;
                        } else {
                            isInvalidMove = true;
                        }
                        break;
                    case 'U':
                        if(x-1 >= 0){
                            moves++;
                            x--;
                        } else {
                            isInvalidMove = true;
                        }
                        break;
                    case 'D':
                        if(x+1 < n){
                            moves++;
                            x++;
                        } else {
                            isInvalidMove = true;
                        }
                        break;
                    default:
                        break;
                }
                cursor++;
            }
            result[i] = moves;
        }
        return result;
    }
}
