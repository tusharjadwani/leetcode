class Solution {
    public int myAtoi(String s) {

        int res = 0;
        int sign = 1;
        boolean changed = false;

        int len = s.length();
        if (len == 0)
            return res;

        int i = 0;
        while (i < len && s.charAt(i) == ' ') {
            i++;
        }

        if (i < len && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-')
                sign = -1;
            i++;
        }
        while (i < len) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                              
                if (sign * res < Integer.MIN_VALUE / 10 || (sign * res == Integer.MIN_VALUE / 10&&c>'8'))
                    return Integer.MIN_VALUE;
                else if (sign*res > Integer.MAX_VALUE/10 || (sign * res == Integer.MAX_VALUE/10 && c > '7'))
                    return Integer.MAX_VALUE;

               res = res * 10 + Integer.valueOf(c - '0');
               i++;
            } else
                break;
        }

        return sign * res;

    }
}