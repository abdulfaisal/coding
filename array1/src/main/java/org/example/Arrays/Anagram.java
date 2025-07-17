package org.example.Arrays;

import java.util.*;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.isEmpty() || t.isEmpty()) return false;
        if(s.length() != t.length()) return false;

        List<Character> list = new ArrayList<>();

        for(int i=0;i<s.length();i++) {
            list.add(s.charAt(i));
        }

        for(int i=0;i<t.length();i++) {
            int index = list.indexOf(t.charAt(i));
            if(index >=0 ) list.remove(index);
        }

        if(list.isEmpty()) return true;
        else return false;
    }
}
