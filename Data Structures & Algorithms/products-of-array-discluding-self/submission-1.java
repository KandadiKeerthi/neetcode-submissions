class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] res = new int[nums.length];
        // for (int i =0;i<nums.length; i++) {
        //     int prod = 1;
        //     for (int j=0;j<nums.length;j++) {
        //         if (i != j) {
        //             prod = prod * nums[j];
        //         }
        //     }
        //     res[i] = prod;
        // }
        // return res;
        int n = nums.length;
        int[] res = new int[n];
        int[] pre = new int[n];
        int[] suf = new int[n];

        pre[0] = 1;
        suf[n-1] = 1;

        for (int i =1; i<n;i++) {
            pre[i] = nums[i-1] * pre[i-1];
        }
        for (int i =n-2; i>=0;i--) {
            suf[i] = nums[i+1] * suf[i+1];
        }
        for(int i = 0; i<n;i++) {
            res[i] = pre[i]*suf[i];
        }
        return res;
    }
}  
