class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();

        if (nums == null || nums.length == 0)
            return res;

        Arrays.sort(nums);

        int len = nums.length;
        for (int i = 0; i < len; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < len; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = len - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        List<Integer> com = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        res.add(com);

                        while (left < right && nums[left] == nums[left + 1])
                            left++;

                        left++;
                        right--;

                    } else if (sum < target)
                        left++;
                    else
                        right--;

                }

            }
        }
        return res;

    }
}