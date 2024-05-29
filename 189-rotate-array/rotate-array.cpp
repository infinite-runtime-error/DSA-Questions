class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int length = nums.size();
        // Creating temp Vector and storing rotated values in this temp Vector directly
        vector<int> temp(length);
        for(int i=0;i<length;i++){
            temp[(i+k)%length] = nums[i];
        }

        // copying values from temp vector to original vector

        for(int i=0;i<length;i++){
            nums[i] = temp[i];
        }
    }
};