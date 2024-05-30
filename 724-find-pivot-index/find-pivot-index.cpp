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

    int prefixSumApproach(vector<int>& nums){
        vector<int> leftSum(nums.size(),0);
        vector<int> rightSum(nums.size(),0);

        // calculate left sum and store in leftSum Vector
        for(int i=1;i<nums.size();i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }

        // calculate right sum and store in rightSum Vector
        for(int j=nums.size()-2;j>=0;j--){
            rightSum[j] = rightSum[j+1] + nums[j+1];
        }

        // check if there exists an index at which leftSum[index] == rightSum[index]
        for(int i=0;i<nums.size();i++){
            if(leftSum[i] == rightSum[i]) return i;
        }
        return -1;
    }

    int pivotIndex(vector<int>& nums) {
        // return bruteForce(nums);

        return prefixSumApproach(nums);
    }
};