class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int res = 0;
        // for (int i = 0; i<s.length();i++) {
        //     Set<Character> set = new HashSet<>();
        //     for (int j = i; j<s.length();j++) {
        //         if (set.contains(s.charAt(j))){
        //             break;
        //         }
        //         set.add(s.charAt(j));
        //     }
        //     res = Math.max(res, set.size());
        // }
        // return res;
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (map.containsKey(c) && map.get(c) >= l){
                l = map.get(c)+1;
            }
            map.put(c, r);
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}
