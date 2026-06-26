class Solution {

    private int getInt(char roman) {
        int res = switch (roman) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
        return res;
    }

    public int romanToInt(String s) {
        int res = 0;
        int max = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int n = getInt(s.charAt(i));
            if (n >= max) {
                res += n;
                max = n;
            } else
                res -= n;
        }
        return res;
    }
}