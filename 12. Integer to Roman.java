class Solution {
    public String intToRoman(int num) {
        String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] nums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        int i = 0;
        StringBuilder res = new StringBuilder();
        while (num > 0) {
            if (num >= nums[i]) {
                res = res.append(romans[i]);
                num -= nums[i];
            } else
                i++;
        }
        return res.toString();

    }
}