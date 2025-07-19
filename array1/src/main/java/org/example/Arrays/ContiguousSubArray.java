package org.example.Arrays;

import java.util.*;

public class ContiguousSubArray {

    int getNumOfContiguousSubArray(int num[]) {

        Set<String> intString = new LinkedHashSet<>();
        int curr;
        int l = num.length;

        int start = 0;
        while(start < l) {
            curr = start;
            int i = curr + 1;
            String s =  ""+ num[curr];
            intString.add(s);
            while(i< l && num[curr] > num[i] ) {
                s+=num[i];
                intString.add(s);
                curr = i;
                i++;
            }
            start ++;
        }

        intString.forEach(str -> System.out.println(str));

        return intString.size();

    }

/*
9,8,4,9,3

9,8,4  9,3
8,4    3
4
9
8
9

 */
}
