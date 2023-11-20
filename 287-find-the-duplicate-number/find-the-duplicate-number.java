class Solution {
    public int findDuplicate(int[] nums) 
    {                     
        
                             // 1st Method



        // First Method is by Sorting and finding Adjacent Elements in Array
        // int temp;
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]>nums[j])
        //         {
        //             temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     if(nums[i]==nums[i+1])
        //     {
        //         return nums[i];
        //     }
        // }
        // return -1;


                            // Second Method



        // Second Method by Visiting Approach
        int ans = -1;
        for(int i=0;i<nums.length;i++)
        {
            int index = Math.abs(nums[i]);
        
          // Finding that if Element is already visited,then return index.
            if(nums[index]<0)
            {
                return index;
            }

            // Marking Element visited
             nums[index] *= -1;
        }
        return ans;

        // Second Method also works Fine But in question, it is given that we  should not modify the Array.But with this approach, we are modifying array ,which doesn't meet the questions requirements.


                            // Third Method




        // Third Approach

        // Positioning Method
        // while(nums[0] != nums[nums[0]])
        // {
        //     int temp = nums[0];
        //     nums[0] = nums[nums[0]];
        //     nums[nums[0]] = temp;
        // }
        // return nums[0];

        // Third Approach code is working in video, but not here.WHY?
    }
}