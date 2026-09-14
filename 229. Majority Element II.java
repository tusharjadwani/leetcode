class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        int count1 = 0, count2 = 0, ans1 = nums[0], ans2 = nums[0];

        for (int num : nums) {

            if (ans1 == num) {
                count1++;
            } else if (ans2 == num) {
                count2++;
            } else if (count1 == 0) {
                ans1 = num;
                count1++;
            } else if (count2 == 0) {
                ans2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (ans1 == num)
                count1++;
            else if (ans2 == num)
                count2++;
        }

        if (count1 > nums.length / 3)
            arr.add(ans1);

        if (count2 > nums.length / 3)
            arr.add(ans2);

        return arr;

    }
}