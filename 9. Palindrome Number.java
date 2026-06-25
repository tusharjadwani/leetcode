class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0)
            return false;

        int no = x;
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return no == rev;

    }
}