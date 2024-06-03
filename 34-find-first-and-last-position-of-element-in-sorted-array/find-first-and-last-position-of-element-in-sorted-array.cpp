class Solution {
public:
    void firstOcuurrence(vector<int>& nums, int &target, int &firstAns){
        int start = 0;
        int end = nums.size()-1;
        int mid = start + (end - start)/2;
        while(start<=end){
            if(nums[mid] == target){
                firstAns = mid;
                end = mid -1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else
            {
                end = mid -1;
            }
            mid = start + (end - start)/2;
        }
    }

    void lastOcuurrence(vector<int>& nums, int &target, int &lastAns){
        int start = 0;
        int end = nums.size()-1;
        int mid = start + (end - start)/2;
        while(start<=end){
            if(nums[mid] == target){
                lastAns = mid;
                start = mid + 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else
            {
                end = mid -1;
            }
            mid = start + (end - start)/2;
        }
    }
    vector<int> searchRange(vector<int>& nums, int target) {
        int firstAns = -1;
        int lastAns = -1;
        firstOcuurrence(nums,target,firstAns);
        lastOcuurrence(nums,target,lastAns);

        vector<int> temp(2);
        temp[0] = firstAns;
        temp[1] = lastAns;
        return temp;
    }
};