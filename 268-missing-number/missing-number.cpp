class Solution {
public:

    int sortingMethod(vector<int>& nums){
        sort(nums.begin(),nums.end());

        for(int i=0;i<nums.size();i++){
            if(i == nums[i]){
                continue;
            }
            else {
                return i;
            }
        }
        return nums.size();
    }

    int XOR(vector<int>& nums){
        int ans = 0;

        // XOR all elements in vector
        for(int i=0;i<nums.size();i++){
            ans ^= nums[i];
        }

        // XOR all ranges [0,N]
        for(int i=0;i<=nums.size();i++){
            ans ^= i;
        }

        return ans;
    }

    int missingNumber(vector<int>& nums) {
        // return sortingMethod(nums);
        return XOR(nums);
    }
};