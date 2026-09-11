class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty() || t.length() > s.length()) return "";
        // Map<Character, Integer> tMap = new HashMap<>();
        // for (char c : t.toCharArray()) {
        //     tMap.put(c, tMap.getOrDefault(c,0)+1);
        // }
        // int left = 0, currentLength = Integer.MAX_VALUE;
        // String resString = "";
        // for (int right = 0; right<s.length(); right++) {
        //     char c = s.charAt(right);
        //     if (tMap.containsKey(c)) {
        //         tMap.put(c, tMap.get(c)-1);
        //     }
        //     while (checkAllZeroes(tMap)) {
        //         if (right-left+1 < currentLength && left < right) {
        //             resString = s.substring(left, right+1);
        //             currentLength = resString.length();
        //         }
        //         char sLeft = s.charAt(left);
        //         if (tMap.containsKey(sLeft)) {
        //             tMap.put(sLeft, tMap.get(sLeft)+1);
        //         }
        //         left++;
        //     }
            
        // }
        // return resString;

        int[] tMap = new int[128];
        for (char c : t.toCharArray()) {
            tMap[c]++;
        }
        int missing = t.length();
        int left = 0, bestStart = 0, currLength = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            if (tMap[c] > 0) missing--;
            tMap[c]--;
            while(missing == 0) {
                if (right - left + 1 < currLength) {
                    currLength = right-left+1;
                    bestStart = left;
                }
                char sLeft = s.charAt(left);
                tMap[sLeft]++;
                if (tMap[sLeft] > 0) missing++;
                left++;
            }
        }
        return currLength == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + currLength);




    }
    // private boolean checkAllZeroes(Map<Character, Integer> tMap) {
    //         for (int count : tMap.values()) {
    //             if (count > 0) return false;
    //         }
    //         return true;
    //     }
}
