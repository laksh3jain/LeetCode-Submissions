class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List <List <Integer>> lists = new ArrayList <>();
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1; 
            int k = len - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    ArrayList <Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    lists.add(list);
                    do j++; while(j < k && nums[j] == nums[j - 1]);
                    do k--; while(j < k && nums[k] == nums[k + 1]);
                }
                else if (nums[i] + nums[j] + nums[k] < 0) do j++; while(j < k && nums[j] == nums[j - 1]);
                else do k--; while(j < k && nums[k] == nums[k + 1]);
            }
        }  
        return lists;
    }
}