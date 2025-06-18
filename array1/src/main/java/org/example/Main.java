package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        DuplicateNum s = new DuplicateNum();
        boolean res = s.hasDuplicate(new int[]{1,2,3,4});
        System.out.println(res);
        res = s.hasDuplicate(new int[]{1,1,3,4});
        System.out.println(res);


        Anagram anagram = new Anagram();
        res = anagram.isAnagram("racecar", "carrace");
        System.out.println(res);
        res = anagram.isAnagram("jar",  "jam");
        System.out.println(res);
    }
}