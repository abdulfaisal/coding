package org.example.DP;

import java.util.Arrays;
import java.util.HashMap;

public class HouseRobb {
    int fund[];
    HashMap<Integer,Integer> AMOUNT = new HashMap<>();
    int max = 0;
    public int rob(int[] nums) {
        int n = nums.length -1;
        fund = nums;

        AMOUNT.put(0,fund[0]);
        for(int i =0 ; i <= n; i++) {
            int total = amount(i);
            if(max<total) max = total;
        }
        //System.out.println(total);



        return max;
    }

    int amount(int n) {
        if(n==0) return fund[0];
        if(n<0) return 0;
        if(AMOUNT.containsKey(n)) return AMOUNT.get(n);

        int total= fund[n] + Math.max(amount(n-2), amount(n-3));
        AMOUNT.put(n, total);
        return total;

    }


    private int[] memo;

    public int robDP(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return dfs(nums, nums.length -1);
    }

    private int dfs(int[] nums, int i) {
        if (i < 0) {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        memo[i] = Math.max(dfs(nums, i - 1),
                nums[i] + dfs(nums, i - 2));
        return memo[i];
    }

}


//  i-1 i i+1



// bruteforce

// max
// i->0-n
//  total =0;
//  j->i+1-n
//    i!j && j>i+1
//       total += n[j]


//      a(n) = nums[n] + a(n-2)

//      a(n-2) = a(n-4) + nums[n-2]

//      a(1) = num[1]
//      a(0) = 0


// 1 2 3 4 5 6 7 8
//
//8 6 4 2   -- 8-2 6-2 4-2
//8 5 3 1  -- 8-3 5-2 3-2
//8 6 4 1  -- 8-2 6-2 4-3
//8 6 3 1  -- 8-2 6-3 3-1
//8 5 2  -- 8-3 5-3
//
//
//
//
//n-2 or n-3

