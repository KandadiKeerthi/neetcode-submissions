class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i <nums.length; i++) {
        //     for (int j = i+1; j<nums.length;j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};
        int n = nums.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i<n;i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, (a,b)->Integer.compare(a[0],b[0]));
        int l=0, r=n-1;
        while (l<r) {
            int sum = pairs[l][0] + pairs[r][0];
            if (sum == target) {
                int i = pairs[l][1], j = pairs[r][1];
                return new int[]{Math.min(i,j), Math.max(i,j)}; 
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
        } 
        return new int[]{};

    }
}
