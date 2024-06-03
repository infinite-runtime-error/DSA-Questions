class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int rows = matrix.size();
        int columns = matrix[0].size();
        int s = 0;
        int n = rows*columns;
        int e = n-1;
        int mid = s+(e-s)/2;

        while(s<=e){
            int rowIndex = mid/columns;
            int columnIndex = mid%columns;

            if(matrix[rowIndex][columnIndex] == target){
                return true;
            }
            else if(matrix[rowIndex][columnIndex] < target){
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
            mid = s+(e-s)/2;
        }
        return false;
    }
};