/**
 * leetcode-121 买卖股票的最佳时机
 *
 * @link {https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/}
 */
public class Problem121 {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}

