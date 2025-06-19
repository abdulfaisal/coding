package org.example;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {

        // by sorting
        List<List<String>> result = new ArrayList<>();
        if(strs.length == 1) {
            result.add(List.of(strs[0]));
            return result;
        }

        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for(String str : strs) {
            char [] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if(anagramMap.containsKey(key)) {
                List<String> res = anagramMap.get(key);
                res.add(str);
                anagramMap.put(key, res);
            } else {
                List<String> res = new ArrayList<>();
                res.add(str);
                anagramMap.put(key, res);
            }
        }

        anagramMap.forEach((key,val) -> result.add(val));
        return result;
    }

    public List<List<String>> groupAnagramsHashTable(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
