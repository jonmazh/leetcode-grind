package mapslistsandBST.maps;

import java.util.Map;
import java.util.HashMap;
/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "f11", t = "b23"

Output: false

Explanation:

The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.

Example 3:

Input: s = "paper", t = "title"

Output: true
 */

public class isomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();

        //O(1)
        if(chars1.length!=chars2.length){return false;}

        for(int i=0;i<chars1.length;i++){
            if(!map.containsKey(chars1[i])){
                if(map.containsValue(chars2[i])){
                    return false;
                }
                map.put(chars1[i], chars2[i]);
            }
            else {
                if(!(map.get(chars1[i]).equals(chars2[i]))){
                    return false;
                }
            }
        }
        return true;
    }
}
