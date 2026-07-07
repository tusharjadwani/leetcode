class Solution {

    private static String[] arr = {
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0)
            return res;

        backtrack(digits, 0, new StringBuilder(), res);

        return res;
    }

    private String getDigitLetters(char digit) {
        int index = Integer.valueOf(digit - '0');
        return arr[index];
    }

    private void backtrack(String digits, int i, StringBuilder word, List<String> res) {

        if (i == digits.length()) {
            res.add(word.toString());
            return;
        }

        String letters = getDigitLetters(digits.charAt(i));

        for (char letter : letters.toCharArray()) {
            word.append(letter);
            backtrack(digits, i + 1, word, res);
            word.deleteCharAt(word.length() - 1);
        }

    }
}