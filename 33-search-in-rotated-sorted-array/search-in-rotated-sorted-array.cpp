class Solution {
public:
    int findPivot(vector<int>& nums){
        int s = 0;
        int e = nums.size()-1;
        int mid = s+(e-s)/2;

        while(s<=e){
            if(s==e){
                return s;
            }
            if(mid+1 < nums.size() && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if (mid-1 >=0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]<nums[s])
            {
                // move left 
                e = mid-1;
            }
            else
            {
                // move right
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        return -1;
    }

    int binarySearch(vector<int>& nums,int s,int e, int target){
        int mid = s+(e-s)/2;
        while(s<=e){
            if(target==nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                s = mid+1;
            }
            else
            {
                e=mid-1;
            }
            mid = s+(e-s)/2;
        }
        return -1;
    }
    int search(vector<int>& nums, int target) {
        int pivotIndex = findPivot(nums);
        cout << "Pivot Index is : " << pivotIndex;
        // Line A
        if(target>=nums[0] && target<=nums[pivotIndex]){
            int ans = binarySearch(nums,0,pivotIndex,target);
            return ans;
        }

        // Line B
        else
        {
            int ans = binarySearch(nums,pivotIndex+1,nums.size()-1,target);
            return ans;
        }
        return -1;
    }
};