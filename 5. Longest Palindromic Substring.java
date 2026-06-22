class Solution {

    /* Brute Force

    private boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();

        if (rev.equals(s))
            return true;
        else
            return false;
    }

    public String longestPalindrome(String s) {
        System.gc();
        int max = 0;
        String subPal = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    if (max < sub.length()) {
                        subPal = sub;
                        max = sub.length();
                    }
                }
            }
        }
        return subPal;
    }*/

    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = findLongestPalindrome(s, i, i);
            int len2 = findLongestPalindrome(s, i, i + 1);
            int max = Math.max(len1, len2);
            if (max > end - start) {
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int findLongestPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else
                break;
        }
        return right - left - 1;
    }

}