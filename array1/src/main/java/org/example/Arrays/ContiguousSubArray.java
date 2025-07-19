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


    int countDecreasingSubarrays(int[] arr) {
        int count = 0;
        int streak = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                streak++;
            } else {
                count += (streak * (streak + 1)) / 2;
                streak = 1;
            }
        }

        count += (streak * (streak + 1)) / 2; // Add last streak
        return count;
    }

/*
9,8,4,9,3

9,8,4  9,3
8,4    3
4
9
8
9,8

 */
}
