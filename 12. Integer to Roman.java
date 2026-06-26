class Solution {
    public String intToRoman(int num) {
        String[] thousands = { "", "M", "MM", "MMM" };
        String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] onces = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

        StringBuilder res = new StringBuilder();

        res = res.append(thousands[num / 1000]).append(hundreds[(num % 1000) / 100]).append(tens[(num % 100) / 10])
                .append(onces[(num % 10)]);

        return res.toString();

    }
}