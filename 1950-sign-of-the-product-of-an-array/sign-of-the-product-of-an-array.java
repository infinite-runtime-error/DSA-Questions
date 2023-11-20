class Solution {
    public int arraySign(int[] nums) {
        int positiveNum = 0;
        int negativeNum = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                positiveNum++;
            }
            else if(nums[i]<0)
            {
                negativeNum++;
            }
            else
            {
                return 0;
            }
        }
        if(negativeNum %2 !=0)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}