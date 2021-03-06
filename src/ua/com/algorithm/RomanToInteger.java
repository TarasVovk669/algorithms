package ua.com.algorithm;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    public int romanToInt(String s) {
        int result = romanMap().get(s.charAt(s.length() - 1));

        for (int i = s.length() - 1; i > 0; i--) {
                if(romanMap().get(s.charAt(i)) > romanMap().get(s.charAt(i-1))){
                    result -= romanMap().get(s.charAt(i-1));
                }else{
                    result += romanMap().get(s.charAt(i-1));
                }
        }
        return result;
    }


    private static Map<Character, Integer> romanMap() {
        var map = new HashMap<Character, Integer>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;

    }

}
