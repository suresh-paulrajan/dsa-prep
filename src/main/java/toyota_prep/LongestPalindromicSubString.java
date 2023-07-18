package main.java.toyota_prep;

public class LongestPalindromicSubString {
    // Find the longest palindromic substring in a given string
    public static void main(String[] args) {
        String input = "racecar";
        System.out.println(findLongestPalindromeSubStringBetter(input));
    }

    private static String findLongestPalindromeSubStringBetter(String input) {
        int maxLen = 1;
        int currentLength = 1;
        String maxPalindrome = String.valueOf(input.charAt(0));
        for (int i = 0, j=i+1; i < input.length(); i++) {
            while (j <= input.length()) {
                String subString = input.substring(i,j);
//                System.out.println("subString : "+subString);
                if(isPalindromeBetter(subString)) {
                    currentLength = subString.length();
                    if(currentLength > maxLen) {
                        maxLen = currentLength;
                        maxPalindrome = subString;
                    }
                }
                j++;
            }
            j = i+1;
        }
        return maxPalindrome;
    }

    private static String findLongestPalindromeSubString(String input) {
        int maxLen = 1;
        int currentLength = 1;
        String maxPalindrome = String.valueOf(input.charAt(0));
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length() && i<j; j++) {
                String subString = input.substring(i,j);
//                System.out.println("subString : "+subString);
                if(isPalindromeBetter(subString)) {
                    currentLength = subString.length();
                    if(currentLength > maxLen) {
                        maxLen = currentLength;
                        maxPalindrome = subString;
                    }
                }
            }
        }
        return maxPalindrome;
    }

    private static boolean isPalindromeBetter(String input) {
        int left = 0;
        int right = input.length()-1;
        while (left < right) {
//            System.out.println("L :: "+left+" :: R :: "+right);
            char leftChar = input.charAt(left);
            char rightChar = input.charAt(right);

            if(leftChar != rightChar)
                return false;

            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String input) {
        return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
    }
}
