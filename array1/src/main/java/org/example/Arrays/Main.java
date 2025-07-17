package org.example.Arrays;

import java.util.List;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());
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


        /**
         * TwoSum
         */
        TwoSum numSum = new TwoSum();
        int[] result = new int[2];
        result = numSum.twoSum(new int[]{3,4,5,6}, 7);
        System.out.printf("\n%d %d\n", result[0] , result[1]);
        result = numSum.twoSum(new int[]{4,5,6}, 10);
        System.out.printf("\n%d %d", result[0] , result[1]);

        result = numSum.twoSum(new int[]{5,5}, 10);
        System.out.printf("\n%d %d\n", result[0] , result[1]);


        /**
         * Angram subList
         */

        GroupAnagram groupAnagramObj = new GroupAnagram();
        List<List<String>> resulGroupAnagram =  groupAnagramObj.groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"});
        logger.info(resulGroupAnagram.toString());


        List<List<String>> resulGroupAnagramHashTable =  groupAnagramObj.groupAnagramsHashTable(new String[]{"act","pots","tops","cat","stop","hat"});
        logger.info(resulGroupAnagram.toString());



    }
}