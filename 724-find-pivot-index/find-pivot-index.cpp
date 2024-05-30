class Solution {
public:

    int bruteForce(vector<int>& nums){
       
        for(int i=0;i<nums.size();i++){
            int leftSum = 0;
            int rightSum = 0;

            // finding leftSum excluding element at current index
            for(int j=0;j<i;j++){
                leftSum += nums[j];
            }

            // finding rightSum excluding element at current index
            for(int j=i+1;j<nums.size();j++){
                rightSum += nums[j];
            }

            // comparing leftSum and rightSum
            if(leftSum == rightSum) return i;
        }
        return -1;
    }

    int pivotIndex(vector<int>& nums) {
        return bruteForce(nums);
    }
};