class Solution {
    public int[] productExceptSelf(int[] nums) {

        int ans[] = new int[nums.length];
        int pre[] = new int[nums.length];
        int suf[] = new int[nums.length];

        pre[0] = 1;
        suf[nums.length - 1] = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            pre[i + 1] = pre[i] * nums[i];
            suf[nums.length - i - 2] = suf[nums.length - i - 1] * nums[nums.length - i - 1];
        }

        for (int j = 0; j < nums.length; j++) {
            ans[j] = pre[j] * suf[j];
        }

        return ans;
    }
}