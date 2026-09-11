class Solution {
    public int findMin(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int j = i+1;
            if (nums[i] < nums[j]) {
                j++;
            }
            else {
                return nums[j];
            }
        }
        return nums[0];
    }
}
