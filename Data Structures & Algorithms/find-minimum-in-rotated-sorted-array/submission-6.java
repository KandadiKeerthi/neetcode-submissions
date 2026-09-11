class Solution {
    public int findMin(int[] nums) {
        // for (int i = 0; i < nums.length-1; i++) {
        //     int j = i+1;
        //     if (nums[i] < nums[j]) {
        //         j++;
        //     }
        //     else {
        //         return nums[j];
        //     }
        // }
        // return nums[0];

        int left = 0, right = nums.length-1;
        while (left < right) {
            int mid = left + (right-left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid+1;
            } else {
            right = mid;
            }

        }
        return nums[left];
    }
}
