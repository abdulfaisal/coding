package org.example.DP;

import java.util.HashMap;

public class CoinChange {
    int dp[];
    int coinsObj[];
    public int coinChange(int[] coins, int amount) {
        coinsObj = coins;
        if(amount<=0) return 0;
        dp = new int[amount+1];
        dp[0] = 0;
        for(int coin: coins) {
            dp[coin] = 1;
        }

        fetchMin(amount);
        if(dp[amount] != 0) return dp[amount];
        else return -1;

    }

    int fetchMin(int n) {
        if(n<0) return -1;

        if(dp[n]!=0) return dp[n];

        int min = Integer.MAX_VALUE;
        boolean possible = false;
        for(int coin:coinsObj) {
            int val = fetchMin(n-coin);
            if(val !=-1 && val < min){
                min = val;
                possible = true;
            }
        }

        if(possible){
            dp[n] = 1 + min;
            return min;
        }
        return -1;

    }


    HashMap<Integer, Integer> memo = new HashMap<>();

    public int dfs(int amount, int[] coins) {
        if (amount == 0) return 0;
        if (memo.containsKey(amount))
            return memo.get(amount);

        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (amount - coin >= 0) {
                int result = dfs(amount - coin, coins);
                if (result != Integer.MAX_VALUE) {
                    res = Math.min(res, 1 + result);
                }
            }
        }

        memo.put(amount, res);
        return res;
    }

    public int coinChangeTD(int[] coins, int amount) {
        int minCoins = dfs(amount, coins);
        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }

}
