class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i<nums.length;i++) {
            m.put(nums[i], m.getOrDefault(nums[i],0)+1);
        }
        List<int[]> list = new ArrayList<>();
        m.forEach((num, freq) -> {
            int[] a = new int[2];
            a[0] = num;
            a[1] = freq;
            list.add(a);
        });
        list.sort((a,b) -> b[1] - a[1]);
        int[] res = new int[k];
        for (int i = 0; i<k;i++) {
            res[i] = list.get(i)[0];
        }
        return res;
    }
}
