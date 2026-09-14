class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.get(num) != null) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
            if (e.getValue() > nums.length/2)
                return e.getKey();
        }

        return 0;
        

    }
}