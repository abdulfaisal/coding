package org.example.DP;

public class Main {
    public static void main(String[] args) {
        HouseRobb houseRobb = new HouseRobb();

//        System.out.println(houseRobb.rob(new int[]{1,2,3,1}));

        System.out.println(houseRobb.robDP(new int[]{1,2,3,1}));
    }
}
