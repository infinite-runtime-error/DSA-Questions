class Solution {
    static int binarySearch(int []nums,int start,int target)
    {
        int end=nums.length-1;
        int mid=start+(end-start)/2;
        while(start<=end)
        {
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return -1;
    }
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(Solution.binarySearch(nums,i+1,nums[i]+k) !=-1)
            {
                set.add(nums[i]);
            }
        }
        return set.size();
    }
}