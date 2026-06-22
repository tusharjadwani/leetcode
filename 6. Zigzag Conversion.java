class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows ==1||s.length()<=numRows)
            return s;

        boolean topDown = false;
        StringBuilder[] stbArr = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            stbArr[i] = new StringBuilder();
        }

        int row = 0;
        for (char c : s.toCharArray()) {
            stbArr[row].append(c);

            if (row == numRows - 1 || row == 0)
                topDown = !topDown;

            row += topDown ? 1 : -1;
        }
        StringBuilder res = new StringBuilder();

        for (StringBuilder stb : stbArr) {
            res.append(stb);
        }
        return res.toString();
    }
}