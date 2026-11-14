class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int stop = -1; 
        for (int i = len - 2; i >= 0; i--) if (nums[i + 1] > nums[i]) {
            stop = i;
            break; 
        }
        for (int i = len - 1; stop != -1 && i > stop; i--) if (nums[i] > nums[stop]) {
            int temp = nums[i];
            nums[i] = nums[stop];
            nums[stop] = temp;
            break;
        }
        int left = stop + 1;
        int right = len - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}