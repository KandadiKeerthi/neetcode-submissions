class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set res = new HashSet<>();
        for (int num : nums) {
            if (res.contains(num)) {
                return true;
            }
            res.add(num);
        }
        return false;
    }
}