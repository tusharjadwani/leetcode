class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null)
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }

        List<Integer> lst = new ArrayList<>(map.keySet());

        lst.sort((a, b) -> map.get(b) - map.get(a));

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = lst.get(i);
        }

        return res;

    }
}