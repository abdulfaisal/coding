package org.example.slidingwindow;

public class MaxSaleProfit {
    public int maxProfit(int[] prices) {

        int l =0;
        int maxSofar = 0;

        for(int i=0;i<prices.length;i++) {
            int currMax = prices[i] - prices[l];
            if(maxSofar < currMax) maxSofar = currMax;
            if(prices[i]<prices[l]) l=i;
        }

        int currMaxatEnd = prices[prices.length-1] - prices[l];
        if(maxSofar < currMaxatEnd) maxSofar = currMaxatEnd;

        return maxSofar;

    }

    public static void main(String[] args) {
        MaxSaleProfit maxSaleProfit = new MaxSaleProfit();

        System.out.println(maxSaleProfit.maxProfit(new int[] {2,1,2,1,0,1,2}));
    }
}
