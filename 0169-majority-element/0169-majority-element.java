class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> hash = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        for (Map.Entry <Integer, Integer> entry : hash.entrySet()) if (entry.getValue() > len/2) return entry.getKey(); return -1; 
    }
}