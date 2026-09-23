class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int max = 0;

        for (int n : set) {
            int count = 1;

            if (set.contains(n - 1))
                continue;

            while (set.contains(n + count))
                count++;

            max = Math.max(max, count);

        }
        return max;
    }
}