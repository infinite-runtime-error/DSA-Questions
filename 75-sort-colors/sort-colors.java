class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int medium = 0;
        int high = nums.length-1;
        while(medium<=high)
        {
            if(nums[medium]==0)
            {
                int temp = nums[medium];
                nums[medium] = nums[low];
                nums[low] = temp;
                medium++;
                low++;
            }
            else if(nums[medium]==1)
            {
                medium++;
            }
            else if(nums[medium]==2)
            {
                int temp = nums[medium];
                nums[medium]= nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}