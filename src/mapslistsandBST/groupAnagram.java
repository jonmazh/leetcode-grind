package mapslistsandBST;

import java.util.*;

public class groupAnagram {
    /*
    Given an array of strings strs, group the anagrams together. You can return the answer in any order.
    Example 1:

    Input: strs = ["eat","tea","tan","ate","nat","bat"]

    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    Explanation:

    There is no string in strs that can be rearranged to form "bat".
    The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
    The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
    Example 2:

    Input: strs = [""]

    Output: [[""]]

    Example 3:

    Input: strs = ["a"]

    Output: [["a"]]



    Constraints:

    1 <= strs.length <= 104
    0 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.
     */

    public static void main (String args[]){
        LRUCache obj = new LRUCache(2);

        obj.put(1, 1);
        obj.put(2, 2);
        System.out.println(obj.get(1));
        obj.put(3, 3);
        System.out.println((obj.get(2)));
        obj.put(4,4);
        System.out.println((obj.get(1)));
        System.out.println((obj.get(3)));
        System.out.println((obj.get(4)));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars = (strs[i].toCharArray());
            Arrays.sort(chars);
            String aux = new String(chars);

            if(!anagrams.containsKey(aux)){
                List<String> values = new ArrayList<>();
                values.add(strs[i]);
                anagrams.put(aux, values);
            } else {
                List<String> value = anagrams.get(aux);
                value.add(strs[i]);
                anagrams.put(aux, value);
            }
        }
        return new ArrayList<>(anagrams.values());
    }
}
