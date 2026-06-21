class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0, max = 0;
        int[] charArr = new int[128];

        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            left = Math.max(left, charArr[currentChar]);

            max = Math.max(max, i-left+1);

            charArr[currentChar] = i + 1;
        }
        
        return max;
        
    }
}