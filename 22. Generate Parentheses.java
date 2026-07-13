class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrackingParenthesis(n, 0, 0, new StringBuilder(), res);
        return res;
    }

    public void backtrackingParenthesis(int n, int open, int close, StringBuilder s, List<String> res) {
        if (s.length() == 2 * n) {
            res.add(s.toString());
            return;
        }

        if (open < n) {
            s.append("(");
            backtrackingParenthesis(n, open + 1, close, s, res);
            s.deleteCharAt(s.length() - 1);
        }
        if (open > close) {
            s.append(")");
            backtrackingParenthesis(n, open, close + 1, s, res);
            s.deleteCharAt(s.length() - 1);
        }
    }
}