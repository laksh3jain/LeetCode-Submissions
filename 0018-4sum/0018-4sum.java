class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List <List <Integer>> lists = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len - 3; i++) {
            if (i != 0 && nums[i - 1] == nums[i]) continue;
            long minSum = (long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
            if (minSum > target) break;
            long maxSum = (long) nums[i] + nums[len - 3] + nums[len - 2] + nums[len - 1];
            if (maxSum < target) continue;
            for (int j = i + 1; j < len - 2; j++) {
                if (j > i + 1 && nums[j - 1] == nums[j]) continue;
                int k = j + 1;
                int l = len - 1;
                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        ArrayList <Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        lists.add(list);
                        k++; 
                        l--; 
                        while (k < l && nums[k - 1] == nums[k]) k++;
                        while (k < l && nums[l + 1] == nums[l]) l--;
                    }
                    else if (sum < target) do k++; while (k < l && nums[k - 1] == nums[k]);
                    else do l--; while (k < l && nums[l + 1] == nums[l]);
                }
            }
        }
        return lists;
    }
}