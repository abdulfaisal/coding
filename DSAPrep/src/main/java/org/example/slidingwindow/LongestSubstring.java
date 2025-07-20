package org.example.slidingwindow;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        if(s.length() == 1) return 1;
        int init = 2;

        Map<Integer,List<String>> allSubstr = new HashMap<>();

        while(init <= s.length()) {
            int i = 0;
            while(i<=s.length()-init) {
                if(allSubstr.containsKey(init)) {
                    allSubstr.get(init).add(s.substring(i,i+init));
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(s.substring(i,i+init));
                    allSubstr.put(init, list);
                }
                i++;
            }
            init++;
        }

        AtomicInteger max = new AtomicInteger(1);
        allSubstr.forEach(
                (key,val) -> {
                    val.forEach(str->{
                        if(!anyRepeated(str)) {
                            if(max.get() < key) max.set(key);
                        }
                    });
                }
        );
        return max.get();
    }

    boolean anyRepeated(String str) {
        Set<Character> characterSet = new HashSet<>();
        char[] charArray = str.toCharArray();
        for(char c : charArray) {
            if(characterSet.contains(c)) return true;
            else characterSet.add(c);
        }
        return false;
    }

    public int lengthSlidingSoln(String s) {
        int max = 0;
        int left =0;
        HashSet<Character> slide = new HashSet<>();
        for(int right = 0; right < s.length() ; right ++) {

            while(slide.contains(s.charAt(right))) {
                slide.remove(s.charAt(left));
                left++;
            }
            slide.add(s.charAt(right));
            max = Math.max(max, slide.size());
        }
        return max;
    }
}
