class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hash = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (hash.containsKey(target - nums[i])) return new int[] {hash.get(target - nums[i]), i};
            hash.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}