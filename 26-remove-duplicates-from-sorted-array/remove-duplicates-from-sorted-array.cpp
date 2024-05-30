class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 1;
        int j = 0;

        // Two Pointer Approach
        while(i<nums.size()){
            if(nums[i] == nums[j]){
                i++;
            }
            else
            {
                nums[++j] = nums[i++];
            }
        }
        return j+1;
    }
};