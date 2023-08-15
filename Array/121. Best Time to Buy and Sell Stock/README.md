# Best Time to Buy and Sell Stock

Link to the problem [here](https://leetcode.com/problems/best-time-to-buy-and-sell-stock).

### [Solution](/Array/121.%20Best%20Time%20to%20Buy%20and%20Sell%20Stock/Solution.java)

```java
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i =0; i < prices.length;i++){
            int price = prices[i];
            if (price < minPrice){
                minPrice = price;
                continue;
            }
            int profit = price - minPrice;
            if (profit > maxProfit)
            maxProfit = profit;
        }
        return maxProfit;
    }
}
```

Time Complexity: ![O(n)](<https://latex.codecogs.com/svg.image?\inline&space;O(n)>), Space Complexity: ![O(1)](<https://latex.codecogs.com/svg.image?\inline&space;O(1)>)

Explanation: Simple algorytm , what iterate array and search minimal and maximum.
