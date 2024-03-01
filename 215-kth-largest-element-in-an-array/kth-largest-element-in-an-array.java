class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ans = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            ans = nums[nums.length-k];
        }
        return ans;
    }
}