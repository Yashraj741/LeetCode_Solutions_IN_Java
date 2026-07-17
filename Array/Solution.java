public class Solution {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // start with very high value
        int maxProfit = 0;                 // no profit initially
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;          // update lowest price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  // update max profit
            }
        }
        return maxProfit;
    }
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 4, 5, 6};
    //     int profit = maxProfit(arr);
    //     System.out.println("Maximum Profit: " + profit);
    // }
}