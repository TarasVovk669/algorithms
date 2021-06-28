package ua.com.algorithm;

//https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {

    public int reverse(int x) {
        var result = 0;

        while (0 != x) {
            int lastNumber = x % 10;
            x = x / 10;

            if (Integer.MAX_VALUE / 10 < result || (Integer.MAX_VALUE / 10 == result && lastNumber > 7)) {
                return 0;
            }
            if (Integer.MIN_VALUE / 10 > result || (Integer.MIN_VALUE / 10 == result && lastNumber < -8)) {
                return 0;
            }
            result = result * 10 + lastNumber;
        }
        return result;
    }
}
