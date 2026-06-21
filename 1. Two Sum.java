class Solution {
    public int[] twoSum(int[] nums, int target) {
        System.gc();
        Map<Integer,Integer> map = new HashMap<>();

        for(int j=0;j<nums.length;j++){
            int complementary = target-nums[j];

            if(map.get(complementary)!=null && map.get(complementary)!=j){
                return new int[]{j,map.get(complementary)};
            }
            map.put(nums[j],j);
        }

        return new int[] {};
    
    }
}