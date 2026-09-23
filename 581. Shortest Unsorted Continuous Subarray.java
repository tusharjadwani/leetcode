class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = nums.length;

        int start = 0;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {

            max = Math.max(max, nums[i]);
            if (max > nums[i])
                end = i;

            min = Math.min(min, nums[n - i - 1]);

            if (min < nums[n - i - 1])
                start = n - i - 1;

        }
        return end - start + 1;
    }
}