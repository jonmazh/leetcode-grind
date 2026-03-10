package arraysandstrings;
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class validAnagram {
    public static void main (String args[]){
        isAnagram("anagram", "nagaram");
    }

    public static boolean isAnagram(String s, String t) {
        int[] chars = new int[26];
        if(s.length()!=t.length()){return false;}
        for (int i=0;i<s.length();i++){
            chars[s.charAt(i) - 'a'] += s.charAt(i);
            chars[t.charAt(i) - 'a'] -= t.charAt(i);
        }
        for(int n : chars){
            if (n!=0){return false;}
        }
        return true;
    }
}
