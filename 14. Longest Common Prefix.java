class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs[0].length() == 0 || strs.length == 1)
            return strs[0];

        String pre = strs[0];
        int i = 0;
        while (i < strs.length) {
            if (strs[i].startsWith(pre)) {
                i++;
            } else {
                int len = pre.length();
                if (len == 0)
                    return pre;

                pre = pre.substring(0, len - 1);
            }
        }
        return pre;
    }
}