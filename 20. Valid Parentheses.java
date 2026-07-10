class Solution {
    public boolean isValid(String c) {

        if (c.length() % 2 == 1)
            return false;

        Deque<Character> stack = new ArrayDeque<>();
        for (char s : c.toCharArray()) {
            if (s == '{') {
                stack.push('}');
            } else if (s == '[') {
                stack.push(']');
            } else if (s == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != s) {
                return false;
            }
        }

        return stack.isEmpty();

    }
}