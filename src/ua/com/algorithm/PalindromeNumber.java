package ua.com.algorithm;

//https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        var numberString = String.valueOf(x);
        for (var i = 0; i < numberString.length() / 2; i++) {

            if (numberString.charAt(i) != numberString.charAt(numberString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
