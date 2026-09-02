class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>(); //[2,3,4,5,10,20]
        for (int num : nums){ //[2,20,4,10,3,4,5]
            set.add(num);
        }
        for (int num : set) {
            if(set.contains(num-1)) continue;
            int streak = 0, curr = num;
            while (set.contains(curr)) {
                streak++;
                curr++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}
