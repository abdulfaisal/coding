package org.example.DP;

public class Main {
    public static void main(String[] args) {
        HouseRobb houseRobb = new HouseRobb();

//        System.out.println(houseRobb.rob(new int[]{1,2,3,1}));

//        System.out.println(houseRobb.robDP(new int[]{1,2,3,1}));

        int coins[] = {1,5,10}, amount = 12;
        CoinChange coinChange = new CoinChange();

        System.out.println(coinChange.coinChange(coins, amount));
    }
}
