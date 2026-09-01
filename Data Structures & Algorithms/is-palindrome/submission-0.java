class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder();

        for (char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)) {
                s1.append(Character.toLowerCase(c));
            }
        }
        String f = s1.toString();
        String b = s1.reverse().toString();
        if (f.equals(b)){
            return true;
        }
        return false;
    }
}
