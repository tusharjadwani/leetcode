class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null)
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }

        List<Integer>[] arr = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (arr[e.getValue()] == null)
                arr[e.getValue()] = new ArrayList<>();

            arr[e.getValue()].add(e.getKey());
        }

        int[] res = new int[k];
        int total = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == null)
                continue;

            for (int n : arr[i]) {
                res[total++] = n;
                if (total == k)
                    return res;
            }
        }

        return  new int[0];

    }
}