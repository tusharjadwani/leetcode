class Solution {
    public boolean isValid(String c) {

        if (c.length() % 2 == 1)
            return false;

        char[] arr = new char[c.length()];
        int i = 0;
        for (char s : c.toCharArray()) {
            if (s == '{') {
                arr[i++] = '}';
            } else if (s == '[') {
                arr[i++] = ']';
            } else if (s == '(') {
                arr[i++] = ')';
            } else if (i == 0 || arr[--i] != s) {
                return false;
            }
        }

        return i == 0;

    }
}