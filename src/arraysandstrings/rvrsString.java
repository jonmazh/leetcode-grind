package arraysandstrings;

/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/

import java.util.Arrays;

public class rvrsString {
    public static void main (String args[]){
        char[] test = {'a', 'b', 'c', 'd'};
        System.out.println(7/2);
    }

    public static void reverseString(char[] s) {
        StringBuilder sr = new StringBuilder();
        for (char c : s) {sr.append(c);}
        int count = 0;
        for (char c : sr.reverse().toString().toCharArray()) {s[count++] = c;}
    }

    public static void reverseString2(char[] s) {
        int pointer = 0;
        while(pointer<s.length/2) {
            char aux = s[s.length - pointer - 1];
            s[s.length - pointer - 1] = s[pointer];
            s[pointer] = aux;
            pointer++;
        }
    }
}

