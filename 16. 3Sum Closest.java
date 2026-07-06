class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int len = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        Arrays.sort(nums);

        for (int i = 0; i < len; i++) {
            int left = i + 1, right = len - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
                if (Math.abs(target - sum) < Math.abs(target - closestSum))
                    closestSum = sum;

            }
        }

        return closestSum;
    }
}