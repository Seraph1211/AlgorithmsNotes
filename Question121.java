// https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150

import utils.CodeUtils;

public class Question121 {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        CodeUtils.print("res", maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int min = prices[0];
        int profit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - min < 0) {
                min = prices[i];
                continue;
            }

            if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }

        return profit;
    }
}
