class Solution {
public:

    // Approach 2:- Visited Approach
    // int visitedApproach(vector<int>& nums){
    //     int ans = -1;
    //     for(int i=0;i<nums.size();i++){
    //         int index = abs(nums[i]);

    //         // Already Visited ?
    //         if(nums[index]<0){
    //             ans = index;
    //             break;
    //         }

    //         // Mark Visited
    //         else 
    //         {
    //             nums[index] *= -1;
    //         }
    //     }
    //     return ans;
    // }

    // Approach 3:- Positioning Method
    int positioningMethod(vector<int>& nums){
        while(nums[0] != nums[nums[0]]){
            swap(nums[0],nums[nums[0]]);
        }
        return nums[0];
    }

    int findDuplicate(vector<int>& nums) {
        // return visitedApproach(nums);
        return positioningMethod(nums);
    }
};