class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {

            if (rev > (Math.pow(2, 31) - 1) / 10 || rev < (-1 * Math.pow(2, 31)) / 10)
                return 0;

            rev = 10 * rev + x % 10;
            x = x / 10;
        }

        return rev;

    }
}