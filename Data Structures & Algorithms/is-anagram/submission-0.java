class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> res1 = new HashMap<>();
        Map<Character, Integer> res2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            res1.put(c, res1.getOrDefault(c,0)+1);
        }
        for (char c : t.toCharArray()) {
            res2.put(c, res2.getOrDefault(c,0)+1);
        }
        
        return res1.equals(res2);
    }
}
