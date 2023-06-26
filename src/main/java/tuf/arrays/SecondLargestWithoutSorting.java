package main.java.tuf.arrays;

import main.java.utils.Logger;

public class SecondLargestWithoutSorting {
    static Logger log = new Logger();

    public static void main(String[] args) {
        int[] input = new int[] {1,2,4,7,7,5};
        log.info(getSecondLargestBetter(input));
    }

    private static int getSecondLargest(int[] input) {
        int largest = input[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < input.length; i++) {
            if(input[i] > largest)
                largest = input[i];
            if(secondLargest < largest && input[i] > secondLargest && input[i] != largest)
                secondLargest = input[i];
        }
        return secondLargest;
    }

    private static int getSecondLargestBetter(int[] input) {
        int largest = input[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < input.length; i++) {
            if(input[i] > largest) {
                secondLargest = largest;
                largest = input[i];
            } else if (input[i] < largest && input[i] > secondLargest) {
                secondLargest = input[i];
            }
        }
        return secondLargest;
    }
}
