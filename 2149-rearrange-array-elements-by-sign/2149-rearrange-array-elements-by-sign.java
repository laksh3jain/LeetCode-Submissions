class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int p = 0;
        int n = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                while (nums[p] < 0) p++;
                ans[i] = nums[p++];
            }
            else {
                while (nums[n] > 0) n++;
                ans[i] = nums[n++];
            }
        }
        return ans;
    }
}