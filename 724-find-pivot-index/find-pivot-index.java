class Solution {
    static int Sum(int[] arr)
    {
        int rightSum = 0;
        for(int i=0;i<arr.length;i++)
        {
            rightSum += arr[i];
        }
        return rightSum;
    }
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = Solution.Sum(nums);
        for(int i=0;i<nums.length;i++)
        {
            rightSum -=nums[i];
            if(leftSum == rightSum)
            {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}