class Solution {
    public boolean isValid(String c) {

        if (c.length() % 2 == 1)
            return false;
        if (c.charAt(0) == ')' || c.charAt(0) == '}' || c.charAt(0) == ']')
            return false;

        char[] arr = new char[c.length()];
        int i = 0;
        for (char s : c.toCharArray()) {
            if (s == '{' || s == '(' || s == '[') {
                arr[i] = s;
            } else if (i > 0 && ((s == '}' && arr[i - 1] == '{') || (s == ')' && arr[i - 1] == '(')
                    || (s == ']' && arr[i - 1] == '['))) {
                i = i - 2;
            } else if (s == '}' || s == ')' || s == ']') {
                arr[i] = s;
            }
            i++;
        }

        return i == 0;

    }
}