class Solution {
    public int majorityElement(int[] nums) {
        int element = 0;                                            
        int vote = 0;
        for (int num : nums) {
            if (vote == 0) element = num;
            if (element == num) vote++;
            else vote--;
        }
        return element;
    }
}