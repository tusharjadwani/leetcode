class Solution {

    private int getNum(char c) {

        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int a2 = getNum(s.charAt(i));
            if (i + 1 != s.length() && getNum(s.charAt(i + 1)) > a2)
                sum -= a2;
            else
                sum += a2;
        }
        return sum;
    }
}