class Solution {
    public int maxProfit(int[] prices) {
        // int res = 0;
        // for (int i = 0; i<prices.length;i++) {
        //     for (int j = i+1; j<prices.length;j++) {
        //         res = Math.max(res, prices[j]-prices[i]);
        //     }
        // }
        // return res;

        int left = 0;
        int right = 1;
        int max = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                max = Math.max(max, prices[right]-prices[left]);
            } else {
                left=right;
            }
            right++;
        }
        return max;
    }
}
