class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> res1 = new HashMap<>();
        for (char c : s.toCharArray()) {
            res1.put(c, res1.getOrDefault(c,0)+1);
        }
        for (char c : t.toCharArray()) {
            if (res1.containsKey(c)) {
            res1.put(c, res1.get(c)-1);
            if (res1.get(c) == 0) res1.remove(c);
            }
            
        }
        return res1.isEmpty();
    }
}
