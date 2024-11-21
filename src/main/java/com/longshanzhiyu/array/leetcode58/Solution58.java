package com.longshanzhiyu.array.leetcode58;

public class Solution58 {
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        while (s.charAt(index) == ' ') {
            index--;
        }
        int wordLength = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            System.out.print(s.charAt(index));
            wordLength++;
            index--;
        }
        return wordLength;
    }
}
