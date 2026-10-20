class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;
        // char[] s1Arr = s1.toCharArray();
        // Arrays.sort(s1Arr);
        // String sortedS1 = new String(s1Arr);

        // for (int i = 0; i < s2.length(); i++) {
        //     for (int j = i; j < s2.length(); j++) {
        //         char[] s2Arr = s2.substring(i, j+1).toCharArray();
        //         Arrays.sort(s2Arr);
        //         String sortedS2 = new String(s2Arr);
        //         if (sortedS1.equals(sortedS2)) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int n = s1.length(), m = s2.length();
        int[] count = new int[26];
        for (char c : s1.toCharArray()) count[c - 'a']++;

        for (int i = 0; i < m; i++) {
            count[s2.charAt(i) - 'a']--;
            if (i >= n) count[s2.charAt(i - n) - 'a']++;
            if (i >= n-1 && allZeroes(count)) return true;
        }
        return false;

    }
    private boolean allZeroes(int[] count) {
        for (int x : count) if (x != 0) return false;
        return true;
    }
}
