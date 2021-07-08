package ua.com.algorithm;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestPrefix {

    public String longestCommonPrefix(String[] strs) {
        String result;

        var targetIndex = strs[0].length();
        for (var i = 1; i < strs.length; i++) {
            result = strs[0].substring(0, targetIndex);
            targetIndex = 0;
            for (var j = 0; j < (Math.min(result.length(), strs[i].length())); j++) {
                if (result.charAt(j) != strs[i].charAt(j)) {

                    break;
                }
                targetIndex++;
            }
        }
        return strs[0].substring(0, targetIndex);
    }
}
