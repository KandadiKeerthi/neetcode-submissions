class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Set<List<Integer>> res = new HashSet<>();
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j<nums.length; j++) {
        //         for (int k = j+1; k<nums.length; k++) {
        //             if (nums[i] + nums[j] + nums[k] == 0) {
        //                 List<Integer> tmp = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 res.add(tmp);
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(res);

        if (nums == null || nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length -2; i++) {
            int left = i+1;
            int right = nums.length-1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> tmp = Arrays.asList(nums[i], nums[left], nums[right]);
                    res.add(tmp);
                    left++;
                    right--;
                } else if (sum < 0 ) {
                    left++;
                } else 
                right--;
            }
        }
        return new ArrayList<>(res);
    }
}
